package com.soulcode.goserviceapp.service.exceptions;

public class UsuarioNaoAutenticadoException extends RuntimeException{
    public UsuarioNaoAutenticadoException() {
        super("Usuario não está autenticado");
    }

    public UsuarioNaoAutenticadoException(String message) {
        super(message);
    }
}
