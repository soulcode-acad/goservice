package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.*;
import com.soulcode.goserviceapp.repository.EnderecoRepository;
import com.soulcode.goserviceapp.repository.UsuarioRepository;
import com.soulcode.goserviceapp.service.exceptions.EnderecoNaoEncontradoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<String> getEstados() {
        return Arrays.asList(
                "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"
        );
    }

    public Endereco findById(Long id) {
        Optional<Endereco> endereco = enderecoRepository.findById(id);
        if (endereco.isPresent()) {
            return endereco.get();
        } else {
            throw new EnderecoNaoEncontradoException();
        }
    }
    public Endereco update(Endereco endereco) {
        Endereco updatedEndereco = this.findById(endereco.getId());
        updatedEndereco.setCidade(endereco.getCidade());
        updatedEndereco.setLogradouro(endereco.getLogradouro());
        updatedEndereco.setNumero(endereco.getNumero());
        updatedEndereco.setUf(endereco.getUf());
        return enderecoRepository.save(updatedEndereco);
    }

}
