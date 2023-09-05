package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Cliente extends Usuario{
    private String telefone;

    @ManyToOne
    private Endereco endereco;

    @Column(length = 14)
    private String cpf;

    private LocalDate dataNascimento;

    public Cliente() {
        super();
        setPerfil(Perfil.CLIENTE);
    }

    public Cliente(String telefone, Endereco endereco, String cpf, LocalDate dataNascimento) {
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Cliente(Long id, String nome, String email, String senha, Perfil perfil, Boolean habilitado) {
        super(id, nome, email, senha, perfil, habilitado);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(telefone, cliente.telefone) &&
                Objects.equals(cpf, cliente.cpf) &&
                Objects.equals(dataNascimento, cliente.dataNascimento)&&
                Objects.equals(endereco, cliente.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefone, cpf, dataNascimento);
    }
}
