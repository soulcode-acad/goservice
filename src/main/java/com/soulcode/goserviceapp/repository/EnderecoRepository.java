package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
@Modifying
@Query(value = "UPDATE Endereco e SET e.logradouro = :novologradouro WHERE e.id = :enderecoId ")
int updateLogradouro (@Param("enderecoId") Long enderecoId, @Param("novoLogradouro") String novoLogradouro);

@Modifying
@Query(value = "UPDATE Endereco e SET e.numero = :novonumero")
int updateNumero (@Param("enderecoId")Long enderecoId, @Param("novoNumero")String novoNumero);

@Modifying
@Query(value = "UPDATE Endereco e SET e.cidade = :novacidade")
int updateCidade(@Param("enderecoId") Long enderecoId, @Param("novaCidade") String novaCidade);

@Modifying
@Query(value = "UPDATE Endereco e SET e.uf = :novouf")
int updateUf (@Param("enderecoId") Long enderecoId, @Param("novaUf") String novaUf);

}
