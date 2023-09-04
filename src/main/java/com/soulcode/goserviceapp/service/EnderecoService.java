package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Endereco;
import com.soulcode.goserviceapp.repository.EnderecoRepository;
import com.soulcode.goserviceapp.service.exceptions.EnderecoNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository) {

        this.enderecoRepository = enderecoRepository;
    }

    public List<Endereco> ListarEnderecos() {

        return enderecoRepository.findAll();
    }

    public Endereco criarEndereco(Endereco novoEndereco) {

        return enderecoRepository.save(novoEndereco);
    }

    public Endereco atualizarEndereco(Long enderecoId, Endereco novoEndereco) {
        Optional<Endereco> enderecoExistente = enderecoRepository.findById(enderecoId);
        if (enderecoExistente.isPresent()) {
            Endereco endereco = enderecoExistente.get();
            endereco.setLogradouro(novoEndereco.getLogradouro());
            endereco.setNumero(novoEndereco.getNumero());
            endereco.setCidade(novoEndereco.getCidade());
            endereco.setUf(novoEndereco.getUf());

            return enderecoRepository.save(endereco);
        }else {
            throw new IllegalArgumentException("Endereço não encontrado.");
            }
        }
        public void excluirEndereco(Long enderecoId) {
            enderecoRepository.deleteById(enderecoId);
        }
    public Endereco buscarEnderecoPorId(Long enderecoId) {
        Optional<Endereco> enderecoOptional = enderecoRepository.findById(enderecoId);

        if (enderecoOptional.isPresent()) {
            return enderecoOptional.get();
        } else {
            throw new EnderecoNaoEncontradoException();
        }
    }
    }
