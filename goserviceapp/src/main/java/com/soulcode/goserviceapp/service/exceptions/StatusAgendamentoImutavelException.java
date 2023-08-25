package com.soulcode.goserviceapp.service.exceptions;

public class StatusAgendamentoImutavelException extends RuntimeException{

    public StatusAgendamentoImutavelException() {
        super("Status Agendamento é Imutavel");
    }

    public StatusAgendamentoImutavelException(String message) {
        super(message);
    }
}
