package com.soulcode.goserviceapp.service.exceptions;

public class EnderecoNaoEncontradoException extends RuntimeException{
    public EnderecoNaoEncontradoException(){
        super("Endereço não encontrado");
    }
    public EnderecoNaoEncontradoException(String message){

        super(message);
    }
}
