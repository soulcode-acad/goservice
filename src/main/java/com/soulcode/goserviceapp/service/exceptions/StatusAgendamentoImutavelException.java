package com.soulcode.goserviceapp.service.exceptions;

public class StatusAgendamentoImutavelException extends RuntimeException{
    public StatusAgendamentoImutavelException() {
        super("O status do agendamento não pode ser alterado.");
    }

    public StatusAgendamentoImutavelException(String message) {
        super(message);
    }
}
