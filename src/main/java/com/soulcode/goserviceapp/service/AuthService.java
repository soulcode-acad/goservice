package com.soulcode.goserviceapp.service;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder encoder;

    public Cliente createCliente(Cliente cliente){
        String passwordEncoded = encoder.encode(cliente.getSenha());
        cliente.setSenha(passwordEncoded);
        cliente.setId(null);
        return usuarioRepository.save(cliente);
    }

    @Transactional
    public void updatePassword(Authentication authentication, String senhaAtual, String senhaNova){
        if(authentication!= null && authentication.isAuthenticated()){
            Optional<Usuario> usuario = usuarioRepository.findByEmail(authentication.getName());
        }
    }
}
