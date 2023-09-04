package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Endereco;
import com.soulcode.goserviceapp.service.EnderecoService;
import com.soulcode.goserviceapp.service.exceptions.EnderecoNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<Endereco>> listarEnderecos() {
        List<Endereco> enderecos = enderecoService.ListarEnderecos();
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{enderecoId}")
    public ResponseEntity<Endereco> buscarEnderecoPorId(Long enderecoId) {
        try {
            Endereco endereco = enderecoService.buscarEnderecoPorId(enderecoId);
            return ResponseEntity.ok(endereco);
        } catch (EnderecoNaoEncontradoException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Endereco> criarEndereco(@RequestBody Endereco novoEndereco) {
        Endereco enderecoCriado = enderecoService.criarEndereco(novoEndereco);
        return ResponseEntity.ok(enderecoCriado);
    }

    @PutMapping("/{enderecoId}")
    public ResponseEntity<Endereco> atualizarEndereco(
            Long enderecoId,
            @RequestBody Endereco novoEndereco
    ) {
        try {
            Endereco enderecoAtualizado = enderecoService.atualizarEndereco(enderecoId, novoEndereco);
            return ResponseEntity.ok(enderecoAtualizado);
        } catch (EnderecoNaoEncontradoException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{enderecoId}")
    public ResponseEntity<Void> excluirEndereco(Long enderecoId) {
        try {
            enderecoService.excluirEndereco(enderecoId);
            return ResponseEntity.noContent().build();
        } catch (EnderecoNaoEncontradoException e) {
            return ResponseEntity.notFound().build();
        }
    }
}

