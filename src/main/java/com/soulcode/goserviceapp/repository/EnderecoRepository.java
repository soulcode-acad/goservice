package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    Optional<Endereco> findById(Long id);

    @Modifying
    @Query(value = "UPDATE enderecos e SET e.cidade = ?, e.logradouro = ?, e.numero = ?, e.uf = ? WHERE id = ?", nativeQuery = true)
    void updateEnderecoById(String cidade, String logradouro, String numero, String uf, Long id);
}
