
/*
 *  file	main.asm
 *  purpose entry point of the program
 *  target	ATmega128L-4MHz-STK300
 *  Created	23.03.2023 12:51:22
 *  Author	Nathann and Felipe
 */

/*
this program is our semester project.
the goal is to use an RC5 compatible remote and decode the signal and use a few other peripheral
the code work as a "smart home" controller.
the remote allowing to change the color of the led and display read value from sensor.

the code logic is as follow :

mostly interruption based code.
the interruption deal with decoding the RC5 code from the remote
once the code is decoded, a state machine handle the transition
handler for each state can be run


REMINDER : 
register 0-15 cant be used for some instruction
beware of corruption of context after an interrupt
*/

; === list of included filee ===

.include "m128def.inc"
.include "macros.asm"
.include "definitions.asm"
.include "interrupt.asm"
.include "timers.asm"
.include "rc5.asm"
.include "neopixel.asm"

; === interrupt table ===
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
.org	OVF0addr ; timer overflow 0 interrupt vector
	jmp int_TIM_0
.org	OVF1addr ; timer overflow 1 interrupt vector
	jmp int_TIM_1
.org	OVF2addr ; timer overflow 2 interrupt vector
	jmp int_TIM_2
.org	OVF3addr ; timer overflow 3 interrupt vector
	jmp int_TIM_3

; === interrupt service routines
; interrution pin 0
int_0:	
		inc	r0
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
		inc	r1
		reti
; interrution pin 5
int_5:	
		reti
; interrution pin 6
int_6:	
		reti
; interrution pin 7
int_7:	
		reti
; interrution Timmer 0 overflow
int_TIM_0:
		SAVECONTEXT
		STOPTIMER0
		RESTORECONTEXT
		reti
; interrution Timmer 1 overflow
int_TIM_1:
		reti
; interrution Timmer 2 overflow
int_TIM_2:
		reti
; interrution Timmer 3 overflow
int_TIM_3:
		reti

; === initialization (reset) ====
reset:	
	LDSP	SOFTRAMEND	; load SP (le stack pointer commence a la fin de la RAM, possible de stocker des donné global avant ça en changant l'addresse)
	; interrupt configuration
	OUTI	EIMSK,0b00111111 ; INT0..5
	OUTEI	EICRA, 0b00000000 ; INT3..0; 00=low, 10=fall, 11=rise
	OUTI	EICRB, 0b00001110 ; INT7..4
	sei	; set global interrupt
	; pin configuration
	ldi r16,0xff
	out DDRE,r16
    ldi r16,0xff
	out DDRB,r16

; === main program ===
main:
	
loop:
	nop
	WAIT_US 100
	sbi PORTE,SPEAKER ; 2 clock is High at the end
	sbi PORTB,2 ; 2 clock is High at the end
	WAIT_US 100
    cbi PORTE,SPEAKER ; 2 clock is low at the end
	cbi PORTB,2 ; 2 clock is High at the end
	rjmp loop

