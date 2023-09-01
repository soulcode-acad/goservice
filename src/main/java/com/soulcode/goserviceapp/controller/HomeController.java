package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={"/", "/home"})
public class HomeController {

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping (value = "/faq")
    public String faq(){
        return "faq";}

    @GetMapping(value = "/PoliticaTermos")
    public String politicaETermos(){
        return "PoliticaTermos";
    }
}

