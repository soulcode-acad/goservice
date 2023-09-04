package com.soulcode.goserviceapp.domain;


import com.soulcode.goserviceapp.domain.enums.StatusAgendamento;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Document(collection = "agendamentos")
public class AgendamentoLog {

    @Id
    private String id;
    private Cliente cliente;
    private Prestador prestador;
    private Servico servico;
    @Enumerated(EnumType.STRING)
    private StatusAgendamento statusAgendamento;
    private LocalDate data;
    private LocalTime hora;
    private LocalDateTime dataHoraRegistro = LocalDateTime.now();

    public AgendamentoLog() {
        this.statusAgendamento = StatusAgendamento.AGUARDANDO_CONFIRMACAO;
    }

    public AgendamentoLog(String id, Cliente cliente, Prestador prestador, Servico servico, StatusAgendamento statusAgendamento, LocalDate data, LocalTime hora) {
        this.id = id;
        this.cliente = cliente;
        this.prestador = prestador;
        this.servico = servico;
        this.statusAgendamento = statusAgendamento;
        this.data = data;
        this.hora = hora;
        this.dataHoraRegistro = LocalDateTime.now();
    }

    public AgendamentoLog(Cliente cliente, Prestador prestador, Servico servico, StatusAgendamento statusAgendamento, LocalDate data, LocalTime hora) {
        this.cliente = cliente;
        this.prestador = prestador;
        this.servico = servico;
        this.statusAgendamento = statusAgendamento;
        this.data = data;
        this.hora = hora;
        this.dataHoraRegistro = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public StatusAgendamento getStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(StatusAgendamento statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDateTime getDataHoraRegistro() {
        return dataHoraRegistro;
    }

    public void setDataHoraRegistro(LocalDateTime dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
    }


}