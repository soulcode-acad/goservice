package com.soulcode.goserviceapp.service.exceptions;

public class UsuarioNaoAutenticadoException extends RuntimeException{

    public UsuarioNaoAutenticadoException() {
        super("Usuario Não esta autenticado");
    }

    public UsuarioNaoAutenticadoException(String message) {
        super(message);
    }
}
