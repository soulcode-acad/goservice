package com.soulcode.goserviceapp.domain;

import com.soulcode.goserviceapp.domain.enums.StatusAgendamento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "agendamentos")
public class Agendamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "O campo do agendamento referente ao cliente não pode ser vazio.")
    @ManyToOne
    @JoinColumn(nullable = false)
    private Cliente cliente;
    @NotNull(message = "O campo do agendamento referente ao prestador não pode ser vazio.")
    @ManyToOne
    @JoinColumn(nullable = false)
    private Prestador prestador;
    @NotNull(message = "O campo do agendamento referente ao serviço não pode ser vazio.")
    @ManyToOne
    @JoinColumn(nullable = false)
    private Servico servico;
    @NotNull(message = "O status do agendamento não pode ser vazio.")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusAgendamento statusAgendamento;
    @NotNull(message = "A data do agendamento não pode ser vazia.")
    @Column(nullable = false)
    private  LocalDate data;
    @NotNull(message = "A hora do agendamento não pode ser vazia.")
    @Column(nullable = false)
    private LocalTime hora;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime dataHoraRegistro;

    public Agendamento(){
        this.statusAgendamento = StatusAgendamento.AGUARDANDO_CONFIRMACAO;
    }

    public Agendamento(Long id, Cliente cliente, Prestador prestador, Servico servico, StatusAgendamento statusAgendamento, LocalDate data, LocalTime hora, LocalDateTime dataHoraRegistro) {
        this.id = id;
        this.cliente = cliente;
        this.prestador = prestador;
        this.servico = servico;
        this.statusAgendamento = statusAgendamento;
        this.data = data;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public boolean isCancelable(){
        return statusAgendamento.equals(StatusAgendamento.AGUARDANDO_CONFIRMACAO);
    }

    public boolean isConfirmable(){
        return statusAgendamento.equals(StatusAgendamento.AGUARDANDO_CONFIRMACAO);
    }

    public boolean isRealizable(){
        return statusAgendamento.equals(StatusAgendamento.CONFIRMADO);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento agendamento = (Agendamento) o;
        return Objects.equals(id, agendamento.id) &&
                Objects.equals(cliente, agendamento.cliente) &&
                Objects.equals(prestador, agendamento.prestador) &&
                Objects.equals(servico, agendamento.servico) &&
                statusAgendamento == agendamento.statusAgendamento &&
                Objects.equals(data, agendamento.data) &&
                Objects.equals(hora, agendamento.hora) &&
                Objects.equals(dataHoraRegistro, agendamento.dataHoraRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cliente, prestador, servico, statusAgendamento, data, hora, dataHoraRegistro);
    }
}
