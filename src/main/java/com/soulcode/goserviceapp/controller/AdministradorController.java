package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class AdministradorController {

    @GetMapping(value = "/servicos")
    public String servico() {
        return "servicosAdmin";
    }
}
