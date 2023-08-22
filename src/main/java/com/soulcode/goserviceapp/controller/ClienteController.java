package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/cliente")
public class ClienteController {

    @GetMapping(value = "/dados")
    public String dados(){
        return "dadosCliente";
    }

    @GetMapping(value = "/agendar")
    public String agendar(){
        return "agendarServico";
    }

    @GetMapping(value = "/historico")
    public String historico(){
        return "historicoCliente";
    }
}
