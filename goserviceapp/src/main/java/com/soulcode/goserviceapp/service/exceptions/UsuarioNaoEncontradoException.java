package com.soulcode.goserviceapp.service.exceptions;

public class UsuarioNaoEncontradoException extends RuntimeException {

    public UsuarioNaoEncontradoException(){
        super("Usuário não econtrado");
    }
    
    public UsuarioNaoEncontradoException(String message){
        super(message);
    }
}
