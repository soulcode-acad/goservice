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
        if(cliente.isPresent()){
            return cliente.get();
        } else {
            throw  new RuntimeException("Cliente não encontrado");
        }
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
