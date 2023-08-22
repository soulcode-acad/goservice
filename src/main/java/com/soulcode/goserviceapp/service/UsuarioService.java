package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Administrador;
import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Prestador;
import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.repository.UsuarioRepository;
 agendar-servico
import com.soulcode.goserviceapp.service.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 main
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

 agendar-servico
    //IoC -> Inversão de Controle

    // IoC -> Inversão de Controle
main
    // DI -> Injeção de Dependência

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UsuarioRepository usuarioRepository;

 agendar-servico
    public List<Usuario> findAll(){ // método para listar todos os usuários
        return usuarioRepository.findAll();
    }

    public Usuario findByID(Long id){
        Optional<Usuario> result = usuarioRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        throw new UsuarioNaoEncontradoException();

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id){
        Optional<Usuario> result = usuarioRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new RuntimeException("Usuário não encontrado.");
 main
    }

    public Usuario createUser(Usuario usuario){
        String passwordEncoded = encoder.encode(usuario.getPassword());
        usuario.setSenha(passwordEncoded);
 agendar-servico
        usuario.setId(null);

        switch (usuario.getPerfil()){
            case ADMIN:
                 return createAndSaveAdministrador(usuario);
            case PRESTADOR:
                return createAndSavePrestador(usuario);


        switch (usuario.getPerfil()){
            case PRESTADOR:
                return createAndSavePrestador(usuario);
            case ADMIN:
                return createAndSaveAdministrador(usuario);
 main
            case CLIENTE:
            default:
                return createAndSaveCliente(usuario);
        }
    }

    private Administrador createAndSaveAdministrador(Usuario u){
 agendar-servico
        Administrador admin = new Administrador(u.getId(), u.getNome(),
                u.getEmail(), u.getSenha(), u.getPerfil(), u.getHabilitado());
        return usuarioRepository.save(admin);
    }
    private Prestador createAndSavePrestador(Usuario u){
        Prestador prestador = new Prestador(u.getId(), u.getNome(), u.getEmail(),
                u.getSenha(), u.getPerfil(), u.getHabilitado());
        return usuarioRepository.save(prestador);
    }
    private Cliente createAndSaveCliente(Usuario u){
        Cliente cliente = new Cliente(u.getId(), u.getNome(), u.getEmail(),
                u.getSenha(), u.getPerfil(), u.getHabilitado());
        return usuarioRepository.save(cliente);
    }


        Administrador admin = new Administrador(u.getId(), u.getNome(), u.getEmail(), u.getSenha(), u.getPerfil(), u.getHabilitado());
        return usuarioRepository.save(admin);
    }

    private Prestador createAndSavePrestador(Usuario u) {
        Prestador prestador = new Prestador(u.getId(), u.getNome(), u.getEmail(), u.getSenha(), u.getPerfil(), u.getHabilitado());
        return usuarioRepository.save(prestador);
    }

    private Cliente createAndSaveCliente(Usuario u) {
        Cliente cliente = new Cliente(u.getId(), u.getNome(), u.getEmail(), u.getSenha(), u.getPerfil(), u.getHabilitado());
        return usuarioRepository.save(cliente);
    }
 main
}
