package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findById(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()){
            return cliente.get();
        }else {
            throw new RuntimeException("Cliente não encontrado");
        }
    }

    public Cliente update(Cliente cliente){
        Cliente updateCliente = this.findById(cliente.getId());
        updateCliente.setNome(cliente.getNome());
        updateCliente.setEmail(cliente.getEmail());
        updateCliente.setCpf(cliente.getCpf());
        updateCliente.setTelefone(cliente.getTelefone());
        updateCliente.setDataNascimento(cliente.getDataNascimento());
        return clienteRepository.save(updateCliente);
    }
}
