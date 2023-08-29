package com.soulcode.goserviceapp.service.exceptions;

public class AgendamentoNaoEncontradoException extends RuntimeException{
    public AgendamentoNaoEncontradoException (){
        super("Agendamento nao econtrado");
    }

    public AgendamentoNaoEncontradoException(String message){
        super(message);
    }
}
