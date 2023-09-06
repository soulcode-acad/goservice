package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={"/", "/home"})
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping (value ="/politica")
    public String politica () {return "politica";}

    @GetMapping (value ="/termoCondicoes")
    public String termoCondicoes () {return "termoCondicoes";}

    @GetMapping (value = "/faq")
    public String faq() {return "faq";}

}
