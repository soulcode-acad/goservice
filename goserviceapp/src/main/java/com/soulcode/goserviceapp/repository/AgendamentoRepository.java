package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentoRepository  extends JpaRepository<Agendamento,Long> {
    @Query(value =
            "SELECT a.* from agendamentos AS a  JOIN usuarios  AS u ON a.cliente_id = u.id"+
                    " WHERE u.email = ?", nativeQuery = true)
    List<Agendamento> findByClienteEmail(String email);
    @Query(value =
            "SELECT a.* from agendamentos AS a  JOIN usuarios  AS u ON a.prestador_id = u.id"+
                    " WHERE u.email = ?", nativeQuery = true)
    List<Agendamento> findByPrestadorEmail(String email);
}
