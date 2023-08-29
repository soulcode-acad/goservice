package com.soulcode.goserviceapp.service.exceptions;

public class SenhaIncorretaException  extends RuntimeException{
    public SenhaIncorretaException() {
        super("Senha Incorreta");
    }

    public SenhaIncorretaException(String message) {
        super(message);
    }
}
