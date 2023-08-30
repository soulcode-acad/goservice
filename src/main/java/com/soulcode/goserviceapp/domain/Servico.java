package com.soulcode.goserviceapp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="servicos")
public class Servico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome do serviço não pode ser vazio.")
    @Column(nullable = false, length = 100)
    private String nome;
    @NotBlank(message = "A descrição do serviço não pode ser vazia.")
    @Column(nullable = false)
    private String descricao;
    @NotBlank(message = "A categoria do serviço não pode ser vazia.")
    @Column(nullable = false)
    private String categoria;

    public Servico(){
    }

    public Servico(Long id, String nome, String descricao, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servico servico = (Servico) o;
        return Objects.equals(id, servico.id) &&
                Objects.equals(nome, servico.nome) &&
                Objects.equals(descricao, servico.descricao) &&
                Objects.equals(categoria, servico.categoria);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, categoria);
    }
}
