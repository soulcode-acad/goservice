package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Cliente;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    Optional<Cliente> findByEmail(String email);
}
