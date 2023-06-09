; file	timer_ov1.asm   target ATmega128L-4MHz-STK300		
; purpose timer 0,1,2 overflow with programmable interrupt period

.include "macros.asm"		; include macro definitions
.include "definitions.asm"	; include register/constant definitions

; === interrupt vector table ===
.org	0
	rjmp	reset
.org	OVF0addr		; timer overflow 0 interrupt vector
	rjmp	overflow0
.org	OVF1addr		; timer overflow 1 interrupt vector
	rjmp	overflow1
.org	OVF2addr		; timer overflow 2 interrupt vector
	rjmp	overflow2
.org	0x30

; === interrupt service routines ====
.set	timer0 = 100
.set	timer1 = 2000
.set	timer2 = 50
.def	_w = r25		; only used during interrupts

overflow0:
	ldi	_w, -timer0+3	; preset timer/counter0
	out	TCNT0, _w
	INVP	PORTC,1		; invert PC1
	reti
overflow1:
	ldi	_w,high(-timer1) 
	out	TCNT1H, _w
	ldi	_w, low(-timer1) 
	out	TCNT1L, _w
	INVP	PORTC,3		; invert PC3
	reti
overflow2:
	ldi	_w, -timer2 
	out	TCNT2, _w
	INVP	PORTC,5		; invert PC5
	reti
	
; === initialisation (reset) ===	
reset: 
	LDSP	RAMEND		; load stack pointer (SP)
	OUTI	PORTB,0xff	; turn LEDs off
	OUTI	DDRB,0xff	; portB = output
	OUTI	DDRC,0xff	; portC = output
		
	OUTI	ASSR, (1<<AS0)	; clock from TOSC1 (external)
	OUTI	TCCR0,1		; CS0=1 CK	
	OUTI	TCCR1B,2	; CS0=1 CK/8
	OUTI	TCCR2,3		; CS0=2 CK/64

	; timer 0,1,2 overflow interrupt enable
	OUTI	TIMSK,(1<<TOIE0)+(1<<TOIE1)+(1<<TOIE2)
	sei					; set global interrupt

; === main program ===
main:
	WAIT_MS	100
	INVP	PORTB,7
	rjmp	main