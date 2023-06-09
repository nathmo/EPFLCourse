;
; AssemblerApplication1.asm
;
; Created: 16.03.2023 09:59:08
; Author : Nathann
;


; Replace with your application code
.include "m128def.inc"
reset:
    ldi r16,0xff
	out DDRE,r16
main:
	sbi PORTE,7
	cbi PORTE,7
	nop
	push r0
	pop r0
	rjmp main
