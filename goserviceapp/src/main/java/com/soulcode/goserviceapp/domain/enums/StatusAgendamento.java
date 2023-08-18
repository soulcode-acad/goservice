package com.soulcode.goserviceapp.domain.enums;

public enum StatusAgendamento {

    AGUARDANDO_CONFIRMACAO("Aguardando Confirmacao"),
    CONFIRMADO ("Confirmado"),
    CONCLUIIDO("Concluido"),
    CALCELADO_PELO_CLIENTE("Cancelado pelo CLiente"),
    CANCELADO_PELO_PRESTADOR("Cancelado pelo Prestador");

    private final String descricao;

    private StatusAgendamento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}

