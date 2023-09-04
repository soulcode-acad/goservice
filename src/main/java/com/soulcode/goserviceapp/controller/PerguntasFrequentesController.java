package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value={"/faq"})
public class PerguntasFrequentesController {

    @GetMapping
    public String perguntasFrequentes(){
        return "perguntasFrequentes";
    }
}