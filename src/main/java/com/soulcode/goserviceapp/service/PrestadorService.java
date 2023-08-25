package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.repository.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestadorService {

    @Autowired
    private PrestadorRepository prestadorRepository;

    @Autowired
    private ServicoService servicoService;


    public Prestador findById(Long id){
        Optional<Prestador> prestador = prestadorRepository.findById(id);
        if (prestador.isPresent()){
            return prestador.get();
        }
        else {
            throw new RuntimeException("Prestador não encontrado");
        }
    }

    public Prestador update(Prestador prestador){
        Prestador updatedPrestador = this.findById(prestador.getId());
        updatedPrestador.setNome(prestador.getNome());
        updatedPrestador.setDescricao(prestador.getDescricao());
        updatedPrestador.setTaxaPorHora(prestador.getTaxaPorHora());
        return prestadorRepository.save(updatedPrestador);
    }


    public Prestador findAuthenticated(Authentication authentication){
        if(authentication != null && authentication.isAuthenticated()){
            Optional<Prestador> prestador = prestadorRepository.findByEmail(authentication.getName());
            if (prestador.isPresent()){
                return prestador.get();
            }
            else {
                throw new RuntimeException("Prestador não encontrado.");
            }
        }
        else {
            throw new RuntimeException("Não autenticado");
        }
    }

    public void addServicoPrestador(Authentication authentication, Long id){
        Prestador prestador = findAuthenticated(authentication);
        Servico servico = servicoService.findById(id);
        prestador.addEspecialidade(servico);
        prestadorRepository.save(prestador);
    }

    public void removeServicoPrestador(Authentication authentication, Long id){
        Prestador prestador = findAuthenticated(authentication);
        Servico servico = servicoService.findById(id);
        prestador.removeEspecialidade(servico);
        prestadorRepository.save(prestador);
    }

    public List<Prestador> findfByServicoId(Long id){
        return prestadorRepository.findByServicoId(id);
    }
}
