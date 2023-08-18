package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Adiministrador extends Usuario {

    public Adiministrador(){
        super();
        setPerfil(Perfil.ADMIN);
    }

    public Adiministrador(Long id, String nome, String email, String senha, Perfil perfil, Boolean habilitado) {
        super(id, nome, email, senha, perfil, habilitado);
    }
}
