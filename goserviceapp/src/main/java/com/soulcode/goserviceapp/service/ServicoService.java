package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    @Cacheable(cacheNames = "redisCache")
    public List<Servico> findAll(){
        System.err.println("Buscando no banco de dados...");
        return servicoRepository.findAll();
    }

    public Servico createServico(Servico servico){
        servico.setId(null);
        return servicoRepository.save(servico);
    }

    public void removeServicoById(Long id){
        servicoRepository.deleteById(id);
    }

    public Servico findById(Long id){
        Optional<Servico> servico = servicoRepository.findById(id);
        if (servico.isPresent()){
            return servico.get();
        }else {
            throw new RuntimeException("Serviço não encontrado");
        }
    }

    public Servico update(Servico servico){
        Servico updateServico = this.findById(servico.getId());
        updateServico.setNome(servico.getNome());
        updateServico.setDescricao(servico.getDescricao());
        updateServico.setCategoria((servico.getCategoria()));
        return servicoRepository.save(updateServico);
    }

    public List<Servico> findByPrestadorEmail(String email){
        return servicoRepository.findByPrestadorEmail(email);
    }
}
