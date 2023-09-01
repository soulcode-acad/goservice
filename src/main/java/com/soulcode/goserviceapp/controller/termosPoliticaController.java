package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={"/aceite"})
public class termosPoliticaController {

    @GetMapping (value = "/politica")
    public String Politica(){
        return "politicaPrivacidade";
    }

    @GetMapping (value = "/termos")
    public String termos(){
        return "termosCondicoes";
    }

}
