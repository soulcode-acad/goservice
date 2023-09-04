package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.domain.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

    @Query(value =
            "SELECT s.*" +
            " FROM servicos s" +
            " JOIN prestadores_servicos ps ON s.id = ps.servico_id" +
            " JOIN usuarios u ON u.id = ps.prestador_id" +
            " WHERE u.email = ?", nativeQuery = true)
    List<Servico> findByPrestadorEmail(String email);

    Page<Servico> findAll(Pageable pageable);

}
