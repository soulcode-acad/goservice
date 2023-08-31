package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class RestApiController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping(value = "/servicos")
    public List<Servico> servicos() {
        List<Servico> servicos = servicoService.findAll();
        return servicos;
    }
}
