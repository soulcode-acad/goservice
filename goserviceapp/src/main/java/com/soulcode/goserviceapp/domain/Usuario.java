package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.Perfil;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Objects;

@Entity  // É utilizada para informar que uma classe também é uma entidade.
// A part disso, a JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados, onde os dados de objetos desse tipo poderão ser persistidos.
@Table(name = "usuarios")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private Boolean habilitado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Perfil perfil;

    public Usuario(){
        this.habilitado = true;
    }

    public Usuario(Long id, String nome, String email, String senha, Boolean habilitado, Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.habilitado = habilitado;
        this.perfil = perfil;
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

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getSenha() {

        return senha;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public Boolean getHabilitado() {

        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {

        this.habilitado = habilitado;
    }

    public Perfil getPerfil() {

        return perfil;
    }

    public void setPerfil(Perfil perfil) {

        this.perfil = perfil;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return null;
    }

    @Override
    public String getPassword() {

        return null;
    }

    @Override
    public String getUsername() {

        return null;
    }

    @Override
    public boolean isAccountNonExpired() {

        return false;
    }

    @Override
    public boolean isAccountNonLocked() {

        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {

        return false;
    }

    @Override
    public boolean isEnabled() {

        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nome, email, senha, perfil);
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }
}
