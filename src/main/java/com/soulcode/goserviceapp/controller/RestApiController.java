package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class RestApiController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping(value = "/servicos")
    public List<Servico> servicos() {
        return servicoService.findAll();
    }

//    @PostMapping
//    @PutMapping
//    @DeleteMapping
}
