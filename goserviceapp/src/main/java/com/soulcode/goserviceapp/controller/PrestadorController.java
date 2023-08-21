package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/prestador")
public class PrestadorController {

    @GetMapping(value = "/dados")
    public String dados(){
        return "dadosPrestador";
    }

    @GetMapping(value = "/agenda")
    public String agenda(){
        return "agendaPrestador";
    }
}
