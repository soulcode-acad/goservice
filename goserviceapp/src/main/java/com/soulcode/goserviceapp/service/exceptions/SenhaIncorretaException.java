package com.soulcode.goserviceapp.service.exceptions;

public class SenhaIncorretaException  extends RuntimeException{
    public SenhaIncorretaException (){
        super("Erro: Senha incorreta");
    }

    public SenhaIncorretaException(String message){
        super(message);
    }
}

