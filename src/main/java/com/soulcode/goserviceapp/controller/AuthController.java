package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.service.UsuarioService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/login")
    public ModelAndView login(@RequestParam(name = "error", required = false) String error) {
        ModelAndView mv = new ModelAndView("login");
        if(error != null) {
            mv.addObject("errorMessage", "Erro ao autenticar no sistema. Verifique suas credenciais.");
        }
        return mv;
    }

    @GetMapping(value = "/cadastro")
    public String cadastro() {
        return "cadastroCliente";
    }

    @GetMapping(value = "/password/new")
    public String alterarSenha() {
        return "alterarSenha";
    }

    @PostMapping(value = "/cadastro")
    public String cadastrarCliente(Cliente cliente, RedirectAttributes attributes) {
        try {
            usuarioService.createUser(cliente);
            attributes.addFlashAttribute("successMessage", "Novo cliente cadastrado com sucesso!");
            return "redirect:/auth/login";
        } catch (Exception ex) {
            attributes.addFlashAttribute("errorMessage", "Erro ao cadastrar novo cliente.");
            return "redirect:/auth/cadastro";
        }
    }
}
