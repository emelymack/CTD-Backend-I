package com.dh.clase39.exceptions;

public class BadRequestException extends Exception{
    public BadRequestException (String mensaje){
        super(mensaje);
    }
}
