;
; AssemblerApplication1.asm
;
; Created: 29.04.2023 11:20:05
; Author : Nathann
;


; Replace with your application code
start:
    ldi r16, 18
	sbci r16,0xfe
	nop
    rjmp start
