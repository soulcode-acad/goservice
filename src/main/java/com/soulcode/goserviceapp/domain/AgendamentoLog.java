package com.soulcode.goserviceapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDateTime;

@Document(collection = "agendamentos")
public class AgendamentoLog {
    @Id
    private String id;

    private String cliente;

    private String prestador;

    private String servico;

    private String statusAgendamento;

    private String data;

    private String hora;
    @Field(targetType = FieldType.DATE_TIME)
    private LocalDateTime dataAgendamento = LocalDateTime.now();

    public AgendamentoLog() {
    }

    public AgendamentoLog(String id, String cliente, String prestador, String servico, String statusAgendamento, String data, String hora) {
        this.id = id;
        this.cliente = cliente;
        this.prestador = prestador;
        this.servico = servico;
        this.statusAgendamento = statusAgendamento;
        this.data = data;
        this.hora = hora;
    }

    public AgendamentoLog (Agendamento agendamento) {
        this.cliente = agendamento.getCliente().getNome();
        this.prestador = agendamento.getPrestador().getNome();
        this.servico = agendamento.getServico().getNome();
        this.statusAgendamento = agendamento.getStatusAgendamento().getDescricao();
        this.data = agendamento.getData().toString();
        this.hora = agendamento.getHora().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getStatusAgendamento() {
        return statusAgendamento;
    }

    public void setStatusAgendamento(String statusAgendamento) {
        this.statusAgendamento = statusAgendamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
}
