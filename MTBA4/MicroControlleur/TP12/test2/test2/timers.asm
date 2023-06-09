/*
 *  file	timers.asm
 *  purpose timers related macro
 *  target	ATmega128L-4MHz-STK300
 *  Created	23.03.2023 12:51:22
 *  Author	Nathann and Felipe
 */ 
 
#ifndef TIMER
#define TIMER


; https://ww1.microchip.com/downloads/en/Appnotes/Atmel-2505-Setup-and-Use-of-AVR-Timers_ApplicationNote_AVR130.pdf
.macro STARTTIMER0	; start a timer with a delay of n * period. (max 64 ms) that trigger an interrupt and stop once elapsed
; @0 = n, @1=period
;0 -> 0 0 0 No clock source. (Timer/Counter stopped)
;1 -> 0 0 1 clkI/O /1 (No prescaling		-> period = 0.25 us
;2 -> 0 1 0 clkI/O /8 (From prescaler)		-> period = 2    us
;3 -> 0 1 1 clkI/O /32 (From prescaler)		-> period = 8    us
;4 -> 1 0 0 clkI/O /64 (From prescaler)     -> period = 16   us
;5 -> 1 0 1 clkI/O /128 (From prescaler)    -> period = 32   us
; DO NOT GO HIGHER than 0x07 AS OTHER BIT ARE USED TO CONTROL THE COUNTER
;TCCR0 3 LSB are the prescaler setting. other bit must be 0, refer to more advanced mode
;TCNT0 8 bit, current value of the counter. can be modified (interrupt on overflow with current settings)
;OCR0  8 bit, compare against value, not used here
;ASSR  4 LSB, 3LSB are read only set to 0 for normal operation. 1 on bit 3 enable asynchronous mode (external clock)
;TIMSK 2 LSB, 0 – TOIE0: Timer/Counter0 Overflow Interrupt Enable, OCIE0: Timer/Counter0 Output Compare Match Interrupt Enable
;TIFR  2 LSB, Bit 0 – TOV0: Timer/Counter0 Overflow Flag, Bit 1 – OCF0: Output Compare Flag 0
	out TCCR0,@1 ; Timer clock = period
	MOV u,@0        ; PRELOAD TIMER WITH n
	COM u           ; (invert all the bit since the counter increment only)
	OUT TCNT0,u
	in  w,TIFR
	cbr w,1<<TOV0 ; clear pending Timer/Counter0 Overflow Interrupt
	out TIFR,w
	in  w,TIMSK
	sbr w,1<<TOIE0 ; Enable Timer/Counter0 Overflow Interrupt
	out TIMSK,w
.endmacro

.macro STOPTIMER0	; STOP timer0, (previous prescaler setting is lost. must reconfigure to restart properly)
	in  w,TIMSK
	cbr w,1<<TOIE0 ; Enable Timer/Counter0 Overflow Interrupt
	out TIMSK,w
.endmacro

.macro INITTIMER2	; start a timer with a delay of n * period. (max 64 ms) that trigger an interrupt and stop once elapsed
; @0 = n, @1=period
;0 -> 0 0 0 No clock source. (Timer/Counter stopped)
;1 -> 0 0 1 clkI/O /1 (No prescaling		-> period = 0.25 us
;2 -> 0 1 0 clkI/O /8 (From prescaler)		-> period = 2    us
;3 -> 0 1 1 clkI/O /64 (From prescaler)		-> period = 16    us
;4 -> 1 0 0 clkI/O /256 (From prescaler)     -> period = 64   us
;5 -> 1 0 1 clkI/O /1024 (From prescaler)    -> period = 256   us
; DO NOT GO HIGHER than 0x07 AS OTHER BIT ARE USED TO CONTROL THE COUNTER
;TCCR0 3 LSB are the prescaler setting. other bit must be 0, refer to more advanced mode
;TCNT0 8 bit, current value of the counter. can be modified (interrupt on overflow with current settings)
;OCR0  8 bit, compare against value, not used here
;ASSR  4 LSB, 3LSB are read only set to 0 for normal operation. 1 on bit 3 enable asynchronous mode (external clock)
;TIMSK 2 LSB, 0 – TOIE0: Timer/Counter0 Overflow Interrupt Enable, OCIE0: Timer/Counter0 Output Compare Match Interrupt Enable
;TIFR  2 LSB, Bit 0 – TOV0: Timer/Counter0 Overflow Flag, Bit 1 – OCF0: Output Compare Flag 0
	out TCCR2,@1 ; Timer clock = period
	MOV u,@0        ; PRELOAD TIMER WITH n
	COM u           ; (invert all the bit since the counter increment only)
	OUT TCNT2,u
	in  w,TIFR
	cbr w,1<<TOV2 ; clear pending Timer/Counter2 Overflow Interrupt
	out TIFR,w

.endmacro

.macro STARTTIMER2	; ENABLE interrupt timer2, 
	in  w,TIMSK
	sbr w,1<<TOIE2 ; disable Timer/Counter2 Overflow Interrupt
	out TIMSK,w
.endmacro

.macro STOPTIMER2	; DISABLE interrupt timer2,
	in  w,TIMSK
	cbr w,1<<TOIE2 ; disable Timer/Counter2 Overflow Interrupt
	out TIMSK,w
.endmacro

#endif
