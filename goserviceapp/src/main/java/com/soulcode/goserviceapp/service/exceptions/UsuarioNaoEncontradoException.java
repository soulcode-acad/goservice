package com.soulcode.goserviceapp.service.exceptions;

public class UsuarioNaoEncontradoException extends RuntimeException {
    public UsuarioNaoEncontradoException(){
        super("Usuario não encontrado!");
    }

    public UsuarioNaoEncontradoException(String message){
        super(message);
    }
}
