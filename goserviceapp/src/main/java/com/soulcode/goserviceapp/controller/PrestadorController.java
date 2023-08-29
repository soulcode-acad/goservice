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
    public ModelAndView  dadosPrestador(Authentication  authentication){
        ModelAndView mv = new ModelAndView("dadosPrestador");
        try{
            Prestador prestador =prestadorService.findAuthenticated(authentication);
            List<Servico> especialidades = servicoService.findByPrestadorEmail(authentication.getName());
            List<Servico> servicos = servicoService.findAll();
            mv.addObject("prestador", prestador);
            mv.addObject("especialidades", especialidades);
            mv.addObject("servicos", servicos);
        }catch(Exception ex){
            mv.addObject("errorMessage","Erro ao carregar os dados do prestador");
        }
        return mv;
    }
    @PostMapping(value="/dados")
    public String editarDados(Prestador prestador, RedirectAttributes attributes){
        try{
            prestadorService.update(prestador);
            attributes.addFlashAttribute("success","Dados alterados");
        }
        catch(UsuarioNaoEncontradoException ex){
            attributes.addFlashAttribute("error",ex.getMessage());
        }
        catch(Exception ex){
            attributes.addFlashAttribute("errorMessage","Erro ao atualizar dados cadastrais");
        }
        return "redirect:/prestador/dados";
    }
    @PostMapping(value = "/dados/especialidade/remover")
    public String removerEspecialidade(@RequestParam(name="servicoId") Long servicoId,
                                       Authentication authentication,
                                       RedirectAttributes attributes){
        try{
            prestadorService.removeServicoPrestador(authentication,servicoId);
            attributes.addFlashAttribute("sucessMessage", "especialidade removida");
        }
        catch (UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException| ServicoNaoEncontradoException ex){
            attributes.addFlashAttribute("errorMessage",ex.getMessage());
        }
        catch(Exception ex){
            attributes.addFlashAttribute("errorMessage", "erro ao remover especialidade");
        }
        return "redirect:/prestador/dados";
    }
    @PostMapping(value = "/dados/especialidade/adicionar")
    public String adicionarEspecialidade(@RequestParam(name="servicoId") Long servicoId,
                                       Authentication authentication,
                                       RedirectAttributes attributes){
        try{
            prestadorService.addServicoPrestador(authentication,servicoId);
            attributes.addFlashAttribute("sucessMessage", "especialidade adicionada");
        }
        catch (UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException| ServicoNaoEncontradoException ex){
            attributes.addFlashAttribute("errorMessage",ex.getMessage());
        }
        catch(Exception ex){
            attributes.addFlashAttribute("errorMessage", "erro ao adicionar especialidade");
        }
        return "redirect:/prestador/dados";
    }
    @GetMapping(value = "/agenda")
    public ModelAndView  agendaPrestador(){
        ModelAndView mv = new ModelAndView("agendaPrestador");
        return mv;
    }
}
