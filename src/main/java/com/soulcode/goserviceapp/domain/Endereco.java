package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Endereco extends Usuario{

    @OneToMany
    private List<Cliente> cliente;

    @OneToMany
    private List<Prestador> prestadores;


    @Column
    private String logradouro;

    @Column
    private String numero;

    @Column
    private String cidade;

    @Column
    private String uf;

    public Endereco(Long id, String nome, String email, String senha, Perfil perfil, Boolean habilitado, String logradouro, String numero, String cidade, String uf) {
        super(id, nome, email, senha, perfil, habilitado);
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }
}
