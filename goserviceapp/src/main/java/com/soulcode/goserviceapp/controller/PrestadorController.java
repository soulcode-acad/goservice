package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.service.PrestadorService;
import com.soulcode.goserviceapp.service.ServicoService;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoAutenticadoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        } catch (UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException ex) {
            mv.addObject("errorMessage", ex.getMessage());
        } catch (Exception ex) {
            mv.addObject("errorMessage", "Erro ao carregar dados do prestador.");
        }
        return mv;
    }
    @GetMapping(value = "/agenda")
    public String agenda(){
        return "agendaPrestador";
    }
}
