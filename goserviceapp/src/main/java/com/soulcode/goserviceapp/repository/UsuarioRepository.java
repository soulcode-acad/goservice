package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Optional<Usuario> findByEmail(String email);
    @Modifying
    @Query(value ="UPDATE usuarios AS u SET u.senha = ? WHERE u.email = ? ", nativeQuery = true)
    void updatePasswordByEmail(String senha, Object email);
    @Modifying
    @Query(value = "UPDATE usuarios  as u SET u.habilitado = ? WHERE u.id = ? ", nativeQuery = true)
    void updateEnableById(boolean b, Long id);
}
