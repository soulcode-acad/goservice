package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Endereco;
import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.domain.enums.Perfil;
import com.soulcode.goserviceapp.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvarOuAtualizarCliente(Usuario usuario) {
        Cliente cliente = usuarioParaCliente(usuario);
        return this.salvarOuAtualizar(cliente);
    }

    public Endereco salvarOuAtualizarPrestador(Usuario usuario) {
        Prestador prestador =usuarioParaPrestador(usuario);
        return this.salvarOuAtualizar(prestador);
    }

    private Endereco salvarOuAtualizar(Usuario usuario) {
        if (Perfil.ADMIN == usuario.getPerfil()) {
            throw new RuntimeException("Administrador não pode atualizar o seu endereço");
        }
        if (usuario.getEndereco().getId() == null) {
            return this.enderecoRepository.save(usuario.getEndereco());
        } else {
            Optional<Endereco> endereco= enderecoRepository.findById(usuario.getEndereco().getId());
            if(endereco.isPresent()){
                return endereco.get();
            }
            throw new RuntimeException("Não foi possível atualizar o endereço");
        }
    }


    private Cliente usuarioParaCliente(Usuario usuario) {
        return (Cliente) usuario;
    }

    private Prestador usuarioParaPrestador(Usuario usuario) {
        return (Prestador) usuario;
    }
}