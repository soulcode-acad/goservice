package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Optional<Usuario> findByEmail(String email);
    @Query(value ="UPDATE usuarios AS u SET u.senha = ? WHERE u.email = ? ", nativeQuery = true)
    void updatePasswordByEmail(String senha, Object email);
}
