package com.soulcode.goserviceapp.service.exceptions;

public class UsuarioNaoAutenticadoException extends RuntimeException{

    public UsuarioNaoAutenticadoException(){
        super("Usuário não autenticado.");
    }

    public UsuarioNaoAutenticadoException(String message){
        super(message);
    }
}
