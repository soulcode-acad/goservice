package com.soulcode.goserviceapp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Endereco")
public class Endereco {
    public Endereco(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "o campo logradouro não pode ficar vazio")
    @Column(nullable = false, unique = true, length = 500)
    private String logradouro;
    @NotNull(message = "o campo numero não pode estar vazio")
    @Column(nullable = false)
    private int numero;
    @NotNull(message = "o campo cidade não pode estar vazio")
    @Column(nullable = false)
    private String cidade;
    @NotNull(message = "o campo uf não pode estar vazio")
    @Column(nullable = false)
   private String uf;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public Endereco(int id, String logradouro, int numero, String cidade, String uf) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getUf(){
        return uf;
    }

    public void setUf(String uf){
        this.uf = uf;
    }
}

