package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {

    @GetMapping(value = "/login")
    public String login(){
            return "login";
    }

    @GetMapping(value = "/signup")
    public String cadastro(){
        return "signup";
    }

    @GetMapping(value = "/password/new")
    public String alterarSenha(){
        return "alterarSenha";

    }
}
