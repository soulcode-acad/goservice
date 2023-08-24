package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/prestador")
public class PrestadorController {
    @GetMapping(value = "/dados")
    public ModelAndView  dadosPrestador(){
        ModelAndView mv = new ModelAndView("dadosPrestador");
        return mv;
    }
    @GetMapping(value = "/agenda")
    public ModelAndView  agendaPrestador(){
        ModelAndView mv = new ModelAndView("agendaPrestador");
        return mv;
    }
}
