package com.soulcode.goserviceapp.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String uf;

    @Column(nullable = false, length = 150)
    private String cidade;

    @Column(nullable = false, length = 150)
    private String logradouro;

    @Column(nullable = false)
    private String numero;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

    public Endereco() {
    }

    public Endereco(Long id, String uf, String cidade, String logradouro, String numero, Usuario usuario) {
        this.id = id;
        this.uf = uf;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id) && Objects.equals(uf, endereco.uf) && Objects.equals(cidade, endereco.cidade) && Objects.equals(logradouro, endereco.logradouro) && Objects.equals(numero, endereco.numero) && Objects.equals(usuario, endereco.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uf, cidade, logradouro, numero, usuario);
    }
}
