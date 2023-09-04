package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Agendamento;
import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.repository.AgendamentoRepository;
import com.soulcode.goserviceapp.repository.ClienteRepository;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoAutenticadoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Cliente findAuthenticated(Authentication authentication){
        if (authentication != null && authentication.isAuthenticated()){
            Optional<Cliente> cliente = clienteRepository.findByEmail(authentication.getName());
            if(cliente.isPresent()){
                return cliente.get();
            } else {
                throw new UsuarioNaoEncontradoException();
            }
        } else {
            throw new UsuarioNaoAutenticadoException();
        }
    }

    public Cliente findById(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent()){
            return cliente.get();
        } else {
            throw  new UsuarioNaoEncontradoException();
        }
    }

    public List<Agendamento> findByDataAgendamento(Authentication authentication, LocalDate dataInicio, LocalDate dataFim) {
        Cliente cliente = this.findAuthenticated(authentication);
        if (dataInicio == null || dataFim == null) {
            throw new RuntimeException("Insira uma data válida");
        }
        return agendamentoRepository.findByDataHistoricoAgendamento(dataInicio, dataFim, cliente.getId());
    }

    public Cliente update(Cliente cliente) {
        Cliente updatedCliente = this.findById(cliente.getId());
        updatedCliente.setNome(cliente.getNome());
        updatedCliente.setEmail(cliente.getEmail());
        updatedCliente.setTelefone(cliente.getTelefone());
        updatedCliente.setCpf(cliente.getCpf());
        updatedCliente.setDataNascimento(cliente.getDataNascimento());
        return clienteRepository.save(updatedCliente);
    }
}
