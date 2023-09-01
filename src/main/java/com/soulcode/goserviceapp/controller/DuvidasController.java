package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value={"/duvidas-frequentes"})
public class DuvidasController {

        @GetMapping
        public String duvidas(){
            return "duvidasFrequentes";
        }
    }


