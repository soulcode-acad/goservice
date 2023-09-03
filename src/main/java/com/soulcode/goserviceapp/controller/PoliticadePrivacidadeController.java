package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={ "/politicadePrivacidade"})
public class PoliticadePrivacidadeController {

    @GetMapping
    public String politicadePrivacidade(){
        return "politicadePrivacidade";
    }
}
