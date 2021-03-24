.386
.model flat, stdcall
.stack 4096

ExitProcess proto, dwExitcode:DWORD

Rectangle STRUCT

    len WORD 2

    wid WORD 2

Rectangle ENDS

.DATA

    r Rectangle <> ;Replace here

.CODE

    main PROC

    MOV AX, r.len

    MUL r.wid

    INVOKE ExitProcess, 0

main ENDP

END main