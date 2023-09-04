package com.soulcode.goserviceapp.domain;
import jakarta.persistence.*;
import java.io.Serializable;


@Table
@Entity
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 100)
    private String logradouro;


    @Column(length = 10)
    private String numero;



    @Column(length = 10)
    private String cidade;


    @Column(length = 2)
    private String uf;




    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String cidade, String uf) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

