package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.repository.ClienteRepository;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoAutenticadoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findAuthenticated(Authentication authentication){
        if(authentication != null && authentication.isAuthenticated()){
            Optional<Cliente> cliente = clienteRepository.findByEmail(authentication.getName());
            if (cliente.isPresent()){
                return cliente.get();
            } else {
                throw new UsuarioNaoEncontradoException();
            }
        }else {
            throw new UsuarioNaoAutenticadoException();
        }
    }
    public Cliente findById(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()){
            return cliente.get();
        }else {
            throw new UsuarioNaoEncontradoException();
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
