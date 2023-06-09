; file	puts1.asm   target ATmega128L-4MHz-STK300
; purpose string display demo

; === interrupt table ===
.cseg
.org	0
	jmp	reset
.org INT0addr
	jmp	int_0	; PIND0..3
.org INT1addr
	jmp	int_1
.org INT2addr
	jmp	int_2
.org INT3addr
	jmp	int_3
.org INT4addr
	jmp	int_4	; PINE4..7
.org INT5addr
	jmp	int_5
.org INT6addr
	jmp	int_6
.org INT7addr
	jmp	int_7
.org OVF0addr ; timer overflow 0 interrupt vector
	jmp int_TIM_0
.org OVF1addr ; timer overflow 1 interrupt vector
	jmp int_TIM_1
.org OVF2addr ; timer overflow 2 interrupt vector
	jmp int_TIM_2
.org OVF3addr ; timer overflow 3 interrupt vector
	jmp int_TIM_3
.org ADCCaddr ; ADC conversion done interrupt vector
	jmp int_ADC

.org 0x100
.include "definition.asm"	; include register/constant definitions
.include "macros.asm"		; include macro definitions
.include "lcd.asm"	; include register/constant definitions
.include "putstr.asm"		; include 
.include "timers.asm"		; include 
.include "interrupt.asm"    ;

; === interrupt service routines

; interrution pin 0
int_0:	
		reti
; interrution pin 1
int_1:	
		reti
; interrution pin 2
int_2:	
		reti
; interrution pin 3
int_3:	
		reti
; interrution pin 4
int_4:	
		reti
; interrution pin 5
int_5:	
		reti
; interrution pin 6
int_6:	
		reti
; interrution pin 7
int_7:	
	SAVECONTEXT
	RESTORECONTEXT
	reti
; interrution Timmer 0 overflow
int_TIM_0:
	SAVECONTEXT
	STOPTIMER0
	ldi zl, low(2*s1) ; affiche AVG et la valeur sur la premiere ligne de l'ecran
	ldi zh, high(2*s1)
	rcall	puts
	RESTORECONTEXT
	reti
; interrution Timmer 1 overflow
int_TIM_1:
	reti
; interrution Timmer 2 overflow
int_TIM_2: ; refresh the display and send the data to the serial port
	ldi zl, low(2*s2) ; affiche AVG et la valeur sur la premiere ligne de l'ecran
	ldi zh, high(2*s2)
	rcall	puts
	reti
; interrution Timmer 3 overflow
int_TIM_3:
	reti
; interrution ADC conversion done
int_ADC:

	reti

reset:
	LDSP	RAMEND			; set up stack pointer (SP)
	rcall LCD_init
	ldi a0, 100
	ldi a1, 2
	;STARTTIMER0 a0, a1 ; start timer avec une periode
	ldi a0, 0
	ldi a1, 5
	INITTIMER2 a0, a1
	STARTTIMER2
	sei
	rjmp	main

; === string constants in program memory ===
s1:	.db	"hello",CR,LF,0
s2:	.db	"Enter number",CR,LF,0
s3:	.db	"Exit",CR,LF,0
s4:	.db	"Error condition",CR,LF,0

main:
	rjmp	main