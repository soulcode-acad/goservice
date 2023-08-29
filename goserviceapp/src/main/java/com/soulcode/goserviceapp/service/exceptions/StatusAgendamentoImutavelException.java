package com.soulcode.goserviceapp.service.exceptions;

public class StatusAgendamentoImutavelException  extends RuntimeException {
    public StatusAgendamentoImutavelException(){
        super("Não foi possível mudar o estado do agendamento : Agendamento imutável");
    }

    public StatusAgendamentoImutavelException(String message){
        super(message);
    }
}
