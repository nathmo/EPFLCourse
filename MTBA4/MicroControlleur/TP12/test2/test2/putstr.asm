; file putstr.asm   target ATmega128L-4MHz-STK300
; purpose library, string display
#ifndef PUTSTR
#define PUTSTR

.include "lcd.asm"	; include register/constant definitions

puts:
; put string constant 
; in 	z 	(pointing to begin of string constant)
;	putc 	(address of a routine to "write" the character)
	lpm					; load the character into r0
	tst	r0				; test for end of string (NUL)
	breq	puts_done
	mov	a0,r0	
	rcall	LCD_putc		; display the string
	adiw	zl,1		; increment the z pointer
	rjmp	puts
puts_done:
	ret
	
putsi:
; put string immediate
; in	.db "string" which is follwing the putsi function call
	POPZ			; pop the "return address" from stack
	MUL2Z			; multiply by 2 (word->byte pointer)
	rcall	puts		; display the string
	DIV2Z			; divide by 2 (byte->word pointer)
	adiw	zl,1		; increment z pointer
	ijmp			; indirect jump to location after "string"

#endif
