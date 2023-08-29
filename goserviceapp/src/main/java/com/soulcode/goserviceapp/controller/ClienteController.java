package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.repository.PrestadorRespository;
import com.soulcode.goserviceapp.service.*;
import com.soulcode.goserviceapp.service.exceptions.AgendamentoNaoEncontradoException;
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

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
@RequestMapping(value = "/cliente")
public class ClienteController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ServicoService servicoService;
    @Autowired
    private PrestadorService prestadorService;
    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping(value ="/dados")
    public ModelAndView dadosCliente(Authentication authentication){
        ModelAndView mv = new ModelAndView("dadosCliente");
        try{
            Cliente cliente = clienteService.findAuthenticated(authentication);
            mv.addObject("cliente", cliente);
        }catch(Exception e){
            mv.addObject("errorMessage", "Erro ao buscar os dados cliente");
        }
        return mv;
    }
    @PostMapping(value ="/dados")
    public String alterarDados(Cliente cliente, RedirectAttributes attributes){
        try{
            clienteService.update(cliente);
            attributes.addFlashAttribute("successMessage","Cliente alterado com sucesso");

        }catch(UsuarioNaoEncontradoException ex){
            attributes.addFlashAttribute("errorMessage",ex.getMessage());
        }
        catch(Exception ex){
            attributes.addFlashAttribute("errorMessage","Erro ao alterar os dados do cliente");
        }
        return "redirect:/cliente/dados";
    }
    @GetMapping(value ="/agendar")
    public ModelAndView agendar(@RequestParam(name ="especialidades", required = false) Long servicoId){
        ModelAndView mv = new ModelAndView("agendarServico");
        try{
        List<Servico> servicos = servicoService.findAll();
        mv.addObject("servicos", servicos);
        if(servicoId != null){
            PrestadorRespository prestadoresService;
            List<Prestador> prestadores = prestadorService.findByServicoId(servicoId);
            mv.addObject("prestadores", prestadores);
            mv.addObject("servicoId",servicoId);
        }
        }
        catch(Exception e){
            mv.addObject("errorMessage", "Erro ao buscar os servicos");
        }
        return mv;
    }
    @PostMapping(value="/agendar")
    public String criarAgendamento(
            @RequestParam(name ="servicoId") Long servicoId,
            @RequestParam(name ="prestadorId") Long prestadorId,
            @RequestParam(name ="data") LocalDate data,
            @RequestParam(name ="hora") LocalTime hora,
            Authentication authentication,
            RedirectAttributes attributes){
        try{
            agendamentoService.create(authentication,servicoId,prestadorId,data,hora);
            attributes.addFlashAttribute("successMessage","Agendamento marcado com sucesso");

        }
        catch(UsuarioNaoAutenticadoException | UsuarioNaoEncontradoException | ServicoNaoEncontradoException ex) {
        attributes.addFlashAttribute("errorMessage", ex.getMessage());
        }
        catch(Exception e){
            attributes.addFlashAttribute("errorMessage","Erro ao finalizar agendamento");
        }
        return "redirect:/cliente/agendar";

    }
    @GetMapping(value ="/historico")
    public ModelAndView historico(){
        ModelAndView mv = new ModelAndView("historicoCliente");
        return mv;
    }
   
}
