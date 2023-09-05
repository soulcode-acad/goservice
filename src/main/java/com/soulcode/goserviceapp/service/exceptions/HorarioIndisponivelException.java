package com.soulcode.goserviceapp.service.exceptions;

public class HorarioIndisponivelException extends RuntimeException{

    public HorarioIndisponivelException() {
        super("Horário de atendimento indisponivel, tente um dia ou horário diferente!");
    }

    public HorarioIndisponivelException(String message) {
        super(message);
    }
}
