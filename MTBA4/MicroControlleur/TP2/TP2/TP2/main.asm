; file loop2.asm target ATmega128L-4MHz-SK300
; TP2.asm
; boucle temporelle paramétrisé
; Created: 08.03.2023 16:24:05
; Author : Nathann
;

.equ clock=4000000 ; clock speed 4MHz
.def w = r16        ; registre tampon

.macro SWAIT_C ;
    ldi w,low((@0)/3)
 a: dec w
    brne a
.endmacro

.macro SWAIT_US ;
    ldi w,low((clock/1000*@0)/3000)
b: dec w
    brne b
.endmacro

reset:
    ldi r16,0xFF
	out DDRB,r16; portB=output
loop:
	nop
	SWAIT_C 100
	inc r0
	out PORTB,r0
	SWAIT_US 15
	inc r0
	out PORTB,r0
	rjmp loop

  
