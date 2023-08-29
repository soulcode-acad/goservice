package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Min;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Prestador extends Usuario{
    private String descricao;

    @Min(value = 10, message = "O valor minimo de taxa cobrada por hora é 10.")
    private Float taxaPorHora;

    @ManyToMany
    @JoinTable(
            name = "prestadores_servicos",
            joinColumns = @JoinColumn(name = "prestador_id"),
            inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
    private List<Servico> especialidades;

    public Prestador(){
        super();
        setPerfil(Perfil.PRESTADOR);
    }

    public Prestador(Long id, String nome, String email, String senha, Perfil perfil, Boolean habilitado) {
        super(id, nome, email, senha, perfil, habilitado);
    }
    public Prestador(Long id, String nome, String email, String senha, Perfil perfil, Boolean habilitado, String descricao, Float taxaPorHora, List<Servico> especialidades) {
        super(id, nome, email, senha, perfil, habilitado);
        this.descricao = descricao;
        this.taxaPorHora = taxaPorHora;
        this.especialidades = especialidades;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getTaxaPorHora() {
        return taxaPorHora;
    }

    public void setTaxaPorHora(Float taxaPorHora) {
        this.taxaPorHora = taxaPorHora;
    }

    public List<Servico> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Servico> especialidades) {
        this.especialidades = especialidades;
    }

    public void addEspecialidade(Servico servico){
        if(especialidades == null){
            especialidades = new ArrayList<>();
        }
        especialidades.add(servico);
    }

    public boolean removeEspecialidade(Servico servico){
        if(especialidades != null){
            return especialidades.remove(servico);
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestador prestador = (Prestador) o;
        return Objects.equals(descricao, prestador.descricao)&&
                Objects.equals(taxaPorHora, prestador.taxaPorHora) &&
                Objects.equals(especialidades, prestador.especialidades);
    }
    @Override
    public int hashCode() {
        return Objects.hash(descricao, taxaPorHora, especialidades);
    }

}
