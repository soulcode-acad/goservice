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

        public Cliente findAuthenticated(Authentication authentication) {
            if(authentication != null && authentication.isAuthenticated()){
                Optional<Cliente> cliente = clienteRepository.findByEmail(authentication.getName());
                if (cliente.isPresent()){
                    return cliente.get();
                }
                throw new UsuarioNaoEncontradoException("Cliente não encontrado");
            }
            throw new UsuarioNaoAutenticadoException("Cliente não autenticado");
        }

        public Cliente findById(Long id){
            Optional<Cliente> result = clienteRepository.findById(id);
            if(result.isPresent()){
                return result.get();
            }
            throw new UsuarioNaoEncontradoException("Prestador não encontrado");
        }

        public Cliente update(Cliente cliente){
            Cliente updateCliente = this.findById(cliente.getId());
            updateCliente.setNome(cliente.getNome());
            updateCliente.setEmail(cliente.getEmail());
            updateCliente.setTelefone(cliente.getTelefone());
            updateCliente.setCpf(cliente.getCpf());
            updateCliente.setDataNascimento(cliente.getDataNascimento());
            return clienteRepository.save(updateCliente);
        }


    }
