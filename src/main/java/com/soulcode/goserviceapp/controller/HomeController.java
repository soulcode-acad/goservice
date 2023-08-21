package com.soulcode.goserviceapp.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping(value={"/", "/home"})
public class HomeController {

    @GetMapping
    public String home(){
        log.info("Iniciando aplicação na página home");
        return "home";
    }
}
