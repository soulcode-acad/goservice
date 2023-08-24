package com.soulcode.goserviceapp.domain.enums;

public enum StatusAgendamento {
    AGUARDANDO_CONFIRMACAO("Aguardando confirmação"),
    CANCELADO_PELO_CLIENTE("Cancelado pelo Cliente"),
    CANCELADO_PELO_PRESTADOR("Cancelado pelo Prestador"),
    CONFIRMADO("Confirmado"),
    CONCLUIDO("Concluido");

    private final String descricao;

    private StatusAgendamento(String descricao) {
    this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
