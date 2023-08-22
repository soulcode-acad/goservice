package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/cadastro")
    public String cadastro(){
        return "cadastroCliente";

    }

    @GetMapping(value = "/password/new")
    public String alterarSenha(){
        return "alterarSenha";
    }

    @PostMapping(value = "/cadastro")
    public String cadastrarCliente(Cliente cliente, RedirectAttributes attributes){
        try {
            usuarioService.createUser(cliente);
            attributes.addFlashAttribute("successMessage", "Cliente cadastrado com sucesso!");
            return "redirect:/auth/login";
        } catch(Exception ex){
            attributes.addFlashAttribute("errorMessage", "Erro ao cadastrar novo cliente.");
            return "redirect:/auth/cadastro";
        }

    }
}
