package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.repository.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrestadorService {

    @Autowired
    private PrestadorRepository prestadorRepository;

    public Prestador findById(Long id) {
        Optional<Prestador> prestador = prestadorRepository.findById(id);
        if (prestador.isPresent()) {
            return prestador.get();
        } else {
            throw new RuntimeException("Prestador não encontrado");
        }
    }

    public Prestador update(Prestador prestador){
        Prestador updatePrestador = this.findById(prestador.getId());
        updatePrestador.setNome(prestador.getNome());
        updatePrestador.setEmail(prestador.getEmail());
        updatePrestador.setDescricao(prestador.getDescricao());
        updatePrestador.setTaxaPorHora(prestador.getTaxaPorHora());
        return prestadorRepository.save(updatePrestador);
    }
}


