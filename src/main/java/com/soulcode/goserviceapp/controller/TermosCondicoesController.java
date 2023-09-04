package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={ "/termosCondicoes"})
public class TermosCondicoesController {

    @GetMapping
    public String termosCondicoes(){
        return "termosCondicoes";
    }
}