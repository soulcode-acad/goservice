package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Agendamento;
import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Service
public class AgendamentoService {
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Autowired
    private  ServicoService servicoService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private PrestadorService prestadorService;

    public Agendamento findById(Long id){
        Optional<Agendamento> agendamento = agendamentoRepository.findById(id);
        if(agendamento.isPresent()) {
            return agendamento.get();
        }
        throw new RuntimeException("Agendamento não foi encontrado");
    }

    public Agendamento create(Authentication authentication, Long servicoId, Long prestadorId, LocalDate data, LocalTime hora){
        Cliente cliente = clienteService.findAuthenticated(authentication);
        Prestador prestador = prestadorService.findById(prestadorId);
        Servico servico = servicoService.findById(servicoId);
        Agendamento agendamento = new Agendamento();
        agendamento.setCliente(cliente);
        agendamento.setPrestador(prestador);
        agendamento.setServico(servico);
        agendamento.setData(data);
        agendamento.setHora(hora);

        return agendamentoRepository.save(agendamento);
    }
}
