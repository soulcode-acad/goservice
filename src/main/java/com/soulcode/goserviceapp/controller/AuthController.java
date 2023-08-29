package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.service.AuthService;
import com.soulcode.goserviceapp.service.UsuarioService;
import com.soulcode.goserviceapp.service.exceptions.SenhaIncorretaException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoAutenticadoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
    private AuthService authService;

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

    @GetMapping(value = "/password/new")
    public String alterarSenha() {
        return "alterarSenha";
    }

    @PostMapping(value = "/password/new")
    public String updatePassword(
            @RequestParam(name = "senhaAtual") String senhaAtual,
            @RequestParam(name = "senhaNova") String senhaNova,
            Authentication authentication,
            RedirectAttributes attributes
    ) {
        try {
            authService.updatePassword(authentication, senhaAtual, senhaNova);
            attributes.addFlashAttribute("successMessage", "Senha alterada.");
        } catch (UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException | SenhaIncorretaException ex) {
            attributes.addFlashAttribute("errorMessage", ex.getMessage());
        } catch (Exception ex) {
            attributes.addFlashAttribute("errorMessage", "Erro ao tentar alterar a senha.");
        }
        return "redirect:/auth/password/new";
    }
}
