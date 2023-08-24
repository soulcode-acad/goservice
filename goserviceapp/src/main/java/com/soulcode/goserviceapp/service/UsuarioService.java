package com.soulcode.goserviceapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.soulcode.goserviceapp.domain.Administrador;
import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.repository.UsuarioRepository;
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;

@Service
public class UsuarioService {
    @Autowired
    private PasswordEncoder enconder;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

 

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
    public Usuario findById(Long id){
        Optional<Usuario> result = usuarioRepository.findById(id);
        if(result.isPresent() ){
            return result.get();
        }  
        throw new UsuarioNaoEncontradoException();
    }

    public Usuario createUser(Usuario usuario){
        String passwordEncoded = enconder.encode(usuario.getSenha());
        usuario.setSenha(passwordEncoded);
        usuario.setId(null);

        switch(usuario.getPerfil()){
            case ADMIN:
                return createAndSaveAdministrador(usuario);
            case PRESTADOR:
                return createAndSavePrestador(usuario);
            case CLIENTE:
                return createAndSaveCliente(usuario);
            default:
                return createAndSaveCliente(usuario);
        }
    }
    private Administrador createAndSaveAdministrador(Usuario usuario){
        Administrador admin= new Administrador(usuario.getId(), usuario.getNome(),usuario.getEmail(), usuario.getSenha(),usuario.getPerfil(), usuario.getHabilitado());
        return usuarioRepository.save(admin);
    }
     private Prestador createAndSavePrestador(Usuario usuario){
        Prestador prestador= new Prestador(usuario.getId(), usuario.getNome(),usuario.getEmail(), usuario.getSenha(),usuario.getPerfil(), usuario.getHabilitado());
        return usuarioRepository.save(prestador);
    }
    private Cliente createAndSaveCliente(Usuario usuario){
        Cliente cliente= new Cliente(usuario.getId(), usuario.getNome(),usuario.getEmail(), usuario.getSenha(),usuario.getPerfil(), usuario.getHabilitado());
        return usuarioRepository.save(cliente);
    }

}
   