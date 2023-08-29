package com.soulcode.goserviceapp.service.exceptions;

public class ServicoNaoEncontradoException extends RuntimeException{
    public ServicoNaoEncontradoException() {
        super("Serviço não encontrado");
    }

    public ServicoNaoEncontradoException(String message) {
        super(message);
    }
}
