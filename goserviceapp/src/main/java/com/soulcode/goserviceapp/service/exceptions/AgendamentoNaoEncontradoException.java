package com.soulcode.goserviceapp.service.exceptions;

public class AgendamentoNaoEncontradoException extends RuntimeException{

    public AgendamentoNaoEncontradoException() {
        super("Agendamento Não Encontrado");
    }

    public AgendamentoNaoEncontradoException(String message) {
        super(message);
    }
}
