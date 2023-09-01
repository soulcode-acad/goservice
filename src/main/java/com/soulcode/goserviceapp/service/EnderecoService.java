package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.*;
import com.soulcode.goserviceapp.repository.EnderecoRepository;
import com.soulcode.goserviceapp.service.exceptions.EnderecoNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public List<String> getEstados() {
        return Arrays.asList(
                "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"
        );
    }

    public Endereco createEndereco(Endereco endereco) {
        endereco.setId(null);
        return enderecoRepository.save(endereco);
    }

    public Endereco findById(Long id) {
        Optional<Endereco> endereco = enderecoRepository.findById(id);
        if(endereco.isPresent()) {
            return endereco.get();
        } else {
            throw new EnderecoNaoEncontradoException();
        }
    }

    @Transactional
    public Endereco update(Endereco endereco) {
        Endereco updateEndereco = this.findById(endereco.getId());
        updateEndereco.setLogradouro(endereco.getLogradouro());
        updateEndereco.setNumero(endereco.getNumero());
        updateEndereco.setCidade(endereco.getCidade());
        updateEndereco.setUf(endereco.getUf());
        return enderecoRepository.save(updateEndereco);
    }

}
