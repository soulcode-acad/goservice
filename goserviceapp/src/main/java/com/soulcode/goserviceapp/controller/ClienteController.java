package com.soulcode.goserviceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.service.UsuarioService;

@Controller
@RequestMapping(value = "/cliente")
public class ClienteController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value ="/dados")
    public ModelAndView dadosCliente(){
        ModelAndView mv = new ModelAndView("dadosCliente");
        return mv;
    }
    @GetMapping(value ="/agendar")
    public ModelAndView agendar(){
        ModelAndView mv = new ModelAndView("agendarServico");
        return mv;
    }
    @GetMapping(value ="/historico")
    public ModelAndView historico(){
        ModelAndView mv = new ModelAndView("historicoCliente");
        return mv;
    }
   
}
