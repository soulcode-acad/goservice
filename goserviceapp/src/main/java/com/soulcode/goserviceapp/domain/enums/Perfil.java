package com.soulcode.goserviceapp.domain.enums;

import com.soulcode.goserviceapp.domain.Cliente;

public enum Perfil {

    ADMIN("Administrador"),
    PRESTADOR("Prestador"),
    CLIENTE("Cliente");

    private final String descricao;

    private Perfil(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
