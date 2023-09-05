package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.util.Objects;

@Entity
public class Endereco extends Usuario{

    @Column(length = 100)
    private String logradouro;

    @Column
    private String numero;

    @Column(length = 100)
    private String cidade;

    @Column(length = 2)
    private String uf;

    public Endereco() {
        super();
    }

    public Endereco(Long id, String nome, String email, String senha, Perfil perfil, Boolean habilitado, String logradouro, String numero, String cidade, String uf) {
        super(id, nome, email, senha, perfil, habilitado);
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return  Objects.equals(logradouro, endereco.logradouro) &&
                Objects.equals(cidade, endereco.cidade) &&
                Objects.equals(numero, endereco.numero) &&
                Objects.equals(uf, endereco.uf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLogradouro(), getNumero(), getCidade(), getUf());
    }
}