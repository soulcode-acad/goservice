package com.soulcode.goserviceapp.service.exceptions;

public class StatusAgendamentoImutavelExeption extends RuntimeException{

    public StatusAgendamentoImutavelExeption(){
        super("Status Agendamento Imutável.");
    }

    public StatusAgendamentoImutavelExeption(String message){
        super(message);
    }
}
