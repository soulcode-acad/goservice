package com.soulcode.goserviceapp.repository;

import com.soulcode.goserviceapp.domain.Agendamento;
import org.apache.catalina.valves.JsonErrorReportValve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    @Query(value="SELECT a.* FROM agendamentos a JOIN usuarios u ON a.cliente_id = u.id WHERE u.email = ? ORDER BY data", nativeQuery = true)
    List<Agendamento> findByClienteEmail(String email);

    @Query(value = "SELECT a.* FROM agendamentos a JOIN usuarios u ON a.prestador_id = u.id WHERE (u.email = ?) AND (a.data BETWEEN ? AND ?) ORDER BY a.data", nativeQuery = true)
    List<Agendamento> findByPrestadorEmail(String email, LocalDate dataMin, LocalDate dataMax);

}
