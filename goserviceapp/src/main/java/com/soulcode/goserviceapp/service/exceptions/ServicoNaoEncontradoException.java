package com.soulcode.goserviceapp.service.exceptions;

public class ServicoNaoEncontradoException extends RuntimeException{

    public ServicoNaoEncontradoException() {
        super("Serviço Não Encontrado");
    }

    public ServicoNaoEncontradoException(String message) {
        super(message);
    }
}
