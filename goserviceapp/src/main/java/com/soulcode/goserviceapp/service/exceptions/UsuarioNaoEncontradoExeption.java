package com.soulcode.goserviceapp.service.exceptions;

public class UsuarioNaoEncontradoExeption extends RuntimeException{

    public UsuarioNaoEncontradoExeption() {
        super("Usuario não encontrado!");
    }

    public UsuarioNaoEncontradoExeption(String message) {
        super(message);
    }
}
