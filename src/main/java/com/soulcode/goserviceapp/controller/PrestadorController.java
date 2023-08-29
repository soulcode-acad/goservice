package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.service.PrestadorService;
import com.soulcode.goserviceapp.service.ServicoService;
import com.soulcode.goserviceapp.service.exceptions.ServicoNaoEncontradoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoAutenticadoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/prestador")
public class PrestadorController {

    @Autowired
    private PrestadorService prestadorService;

    @Autowired
    private ServicoService servicoService;

    @GetMapping(value = "/dados")
    public ModelAndView dados(Authentication authentication) {
        ModelAndView mv = new ModelAndView("dadosPrestador");
        try {
            Prestador prestador = prestadorService.findAuthenticated(authentication);
            mv.addObject("prestador", prestador);
            List<Servico> especialidades = servicoService.findByPrestadorEmail(authentication.getName());
            mv.addObject("especialidades", especialidades);
            List<Servico> servicos = servicoService.findAll();
            mv.addObject("servicos", servicos);
        } catch (UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException ex) {
            mv.addObject("errorMessage", ex.getMessage());
        } catch (Exception ex) {
            mv.addObject("errorMessage", "Erro ao carregar dados do prestador.");
        }
        return mv;
    }

    @PostMapping(value = "/dados")
    public String editarDados(Prestador prestador, RedirectAttributes attributes) {
        try {
            prestadorService.update(prestador);
            attributes.addFlashAttribute("successMessage", "Dados alterados.");
        } catch (UsuarioNaoEncontradoException ex) {
            attributes.addFlashAttribute("errorMessage", ex.getMessage());
        } catch (Exception ex) {
            attributes.addFlashAttribute("errorMessage", "Erro ao alterar dados cadastrais.");
        }
        return "redirect:/prestador/dados";
    }

    @PostMapping(value = "/dados/especialidade/remover")
    public String removerEspecialidade(
            @RequestParam(name = "servicoId") Long id,
            Authentication authentication,
            RedirectAttributes attributes) {
        try {
            prestadorService.removeServicoPrestador(authentication, id);
            attributes.addFlashAttribute("successMessage", "Especialidade removida");
        } catch (UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException | ServicoNaoEncontradoException ex) {
            attributes.addFlashAttribute("errorMessage", ex.getMessage());
        } catch (Exception ex) {
            attributes.addFlashAttribute("errorMessage", "Erro ao remover especialidade.");
        }
        return "redirect:/prestador/dados";
    }

    @PostMapping(value = "/dados/especialidade/adicionar")
    public String adicionarEspecialidade(
            @RequestParam(name = "servicoId") Long id,
            Authentication authentication,
            RedirectAttributes attributes) {
        try {
            prestadorService.addServicoPrestador(authentication, id);
            attributes.addFlashAttribute("successMessage", "Especialidade adicionada.");
        } catch (UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException | ServicoNaoEncontradoException ex) {
            attributes.addFlashAttribute("errorMessage", ex.getMessage());
        } catch (Exception ex) {
            attributes.addFlashAttribute("errorMessage", "Erro ao adicionar nova especialidade.");
        }
        return "redirect:/prestador/dados";
    }

    @GetMapping(value = "/agenda")
    public String agenda() {
        return "agendaPrestador";
    }
}
