package com.soulcode.goserviceapp.controller;

import com.soulcode.goserviceapp.domain.Servico;
import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.service.ServicoService;
import com.soulcode.goserviceapp.service.UsuarioService;

import java.util.List;

import com.soulcode.goserviceapp.service.exceptions.ServicoNaoEncontradoException;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/admin")
public class AdministradorController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ServicoService servicoService;
    @GetMapping(value = "/servicos")
    public ModelAndView servicos() {
        ModelAndView mv = new ModelAndView("servicosAdmin");
        try {
            List<Servico> servicos = servicoService.findAll();
            mv.addObject("servicos", servicos);
        } catch (Exception ex) {
            mv.addObject("errorMessage", "Erro ao buscar dados de serviços.");
        }
        return mv;
    }

    @PostMapping(value ="/servicos")
    public String createService(Servico servico, RedirectAttributes attributes){
        try{
            servicoService.createServico(servico);
            attributes.addFlashAttribute("sucessMessage","Novo serviço adicionado com sucesso");
        }
        catch (Exception ex){
            attributes.addFlashAttribute("errorMessage", "Erro ao adicionar esse novo serviço");
        }
        return "redirect:/admin/servicos";
    }
    @PostMapping(value="/servicos/remover")
    public String removeService(@RequestParam(name = "servicoId") Long id, RedirectAttributes attributes){
        try{
            servicoService.removeServicoById(id);
            attributes.addFlashAttribute("sucessMessage","Serviço removido com sucesso");
        }
        catch (Exception ex){
            attributes.addFlashAttribute("errorMessage", "Erro ao adicionar esse novo serviço");
        }
        return "redirect:/admin/servicos";
    }
    @GetMapping(value="/servicos/editar/{id}")
    public ModelAndView editService(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("editarServico");
        try{
            Servico servico = servicoService.findById(id);
            mv.addObject("servico", servico);
        }
        catch(ServicoNaoEncontradoException ex){
            mv.addObject("errorMessage", ex.getMessage());
        }catch(Exception ex){
            mv.addObject("errorMessage", "erro ao buscar os dados do serviço");
        }
        return mv;
    }
    @PostMapping(value="/servicos/editar")
    public String updateService (Servico servico, RedirectAttributes attributes){
        try{
            servicoService.update(servico);
            attributes.addFlashAttribute("sucessMessage","dados do serviço alterados.");
        } catch (ServicoNaoEncontradoException ex){
            attributes.addFlashAttribute("errorMessage", ex.getMessage());
        }
        catch (Exception ex){
            attributes.addFlashAttribute("errorMessage", "Erro ao alterar os dados do serviço");
        }
        return "redirect:/admin/servicos";
    }

    @GetMapping(value ="/usuarios")
    public ModelAndView usuarios(){
        ModelAndView mv = new  ModelAndView("usuariosAdmin");
        try{
            List<Usuario> usuarios = usuarioService.findAll();
             mv.addObject("usuarios", usuarios);
        }
        catch(Exception ex){
            mv.addObject("erroMessage","Erro ao buscar dados dos usuários");    
        }
        return mv;
    }
    @PostMapping(value = "/usuarios")
    public String createUser(Usuario usuario, RedirectAttributes attributes) {
        try {
            usuarioService.createUser(usuario);
            attributes.addFlashAttribute("successMessage", "Novo usuário cadastrado.");
        } catch (Exception ex) {
            attributes.addFlashAttribute("errorMessage", "Erro ao cadastrar novo usuário.");
        }
        return "redirect:/admin/usuarios";
    }
    @PostMapping(value = "/usuarios/disable")
    public  String disableUser(@RequestParam(name = "usuarioId") Long id, RedirectAttributes attributes){
        try{
          usuarioService.diableUser(id);
        } catch(UsuarioNaoEncontradoException ex) {
            attributes.addFlashAttribute("errorMessage", ex.getMessage());
        }catch (Exception e){
            attributes.addFlashAttribute("errorMessage","Erro ao desabilitar usuário");
        }
        return "redirect:/admin/usuarios";
    }
    @PostMapping(value = "/usuarios/enable")
    public  String enableUser(@RequestParam(name = "usuarioId") Long id, RedirectAttributes attributes) {
        try {
            usuarioService.enableUser(id);
        } catch(UsuarioNaoEncontradoException ex){
            attributes.addFlashAttribute("errorMessage",ex.getMessage());
        }catch (Exception e) {
            attributes.addFlashAttribute("errorMessage", "Erro ao desabilitar usuário");
        }
        return "redirect:/admin/usuarios";
    }

}