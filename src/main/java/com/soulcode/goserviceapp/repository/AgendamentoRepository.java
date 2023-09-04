package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    @Query(value="SELECT a.* FROM agendamentos a JOIN usuarios u ON a.cliente_id = u.id WHERE u.email = ? ORDER BY data", nativeQuery = true)
    List<Agendamento> findByClienteEmail(String email);

    @Query(value = "SELECT a.* FROM agendamentos a JOIN usuarios u ON a.prestador_id = u.id WHERE u.email = ? ORDER BY data", nativeQuery = true)
    List<Agendamento> findByPrestadorEmail(String email);

    @Query(value = "SELECT count(*) FROM agendamentos a JOIN usuarios u ON a.cliente_id = u.id WHERE u.email = ? AND a.status_agendamento = 'CONFIRMADO'", nativeQuery = true)
    Long notificarAgendamentosPendentes(String email);

    @Query(value = "SELECT a.* FROM agendamentos a WHERE a.prestador_id = ? AND a.data = ?", nativeQuery = true)
    List<Agendamento> findByPrestadorAndData(Long prestadorId, LocalDate data);
}

