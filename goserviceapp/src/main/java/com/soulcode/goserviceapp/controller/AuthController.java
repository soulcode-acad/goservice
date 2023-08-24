package com.soulcode.goserviceapp.controller;

import java.lang.ProcessBuilder.Redirect;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.service.AuthService;
import com.soulcode.goserviceapp.service.UsuarioService;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {
 
    @Autowired
    private AuthService authService;

    @GetMapping(value = "/login")
    public ModelAndView login(@RequestParam(name = "error", required = false) String error) {
        ModelAndView mv = new ModelAndView("login");
        if (error != null) {
            mv.addObject("errorMessage", "erro ao autenticar o usuario, por favor, verifique suas credenciais");
        }
        return mv;
    }

    @GetMapping(value = "/cadastro")
    public ModelAndView cadastro() {
        ModelAndView mv = new ModelAndView("cadastroCliente");
        return mv;
    }

    @GetMapping(value = "/password/new")
    public ModelAndView alterarSenha() {
        ModelAndView mv = new ModelAndView("alterarSenha");
        return mv;
    }

   @PostMapping(value = "/password/new")
    public String updatePassword(
            @RequestParam(name = "senhaAtual") String senhaAtual,
            @RequestParam(name = "senhaNova") String senhaNova,
            Authentication authentication,
            RedirectAttributes attributes
    ) {
        authService.updatePassword(authentication, senhaAtual, senhaNova);
        return "redirect:/auth/password/new";
    }

    @PostMapping(value = "/cadastro")
    public String cadastrarCliente(Cliente cliente, RedirectAttributes attributes) {
        try {
            authService.createCliente(cliente);
            attributes.addFlashAttribute("successMessage", "Novo cliente cadastrado com sucesso!");
            return "redirect:/auth/login";
        } catch (Exception ex) {
            attributes.addFlashAttribute("errorMessage", "Erro ao cadastrar novo cliente.");
            return "redirect:/auth/cadastro";
        }
    }
}