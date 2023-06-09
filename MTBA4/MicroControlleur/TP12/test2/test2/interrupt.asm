/*
 *  file	interrupt.asm
 *  purpose macros useful to setup interrupt
 *  target	ATmega128L-4MHz-STK300
 *  Created	23.03.2023 12:51:22
 *  Author	Nathann and Felipe
 */ 

#ifndef INTERRUPT
#define INTERRUPT

; save the content of the u,w and SREG to the stack
.macro SAVECONTEXT
	mov _w, w
	mov _u, u
	in _sreg, SREG
.endmacro

; save the content of the u and SREG to the stack
.macro RESTORECONTEXT
	mov w, _w
	mov u, _u
	out SREG, _sreg
.endmacro


#endif
