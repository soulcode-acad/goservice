package com.soulcode.goserviceapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soulcode.goserviceapp.domain.Cliente;
import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.repository.UsuarioRepository;



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
        if(authentication == null && authentication.isAuthenticated()){
            String emailAuthenticated = authentication.getName();
            Optional <Usuario> usuario = usuarioRepository.findByEmail(authentication.getName());
            if(usuario.isPresent()){
                String passwordEncoded = usuario.get().getSenha();
                boolean passwordVerified = encoder.matches(senhaAtual, passwordEncoded); 
                if(passwordVerified ){
                    String passwordEncodedNew = encoder.encode(senhaNova);
                    usuarioRepository.updatePasswordByEmail(passwordEncodedNew, emailAuthenticated);
                    return;
                }
                else{
                    throw new RuntimeException("Senha não coincide");
                }
            }
            else{
                throw new RuntimeException("Usuario não encontrado");
            }
        }
        else{
            throw new RuntimeException("Autenticação necessaria");
        }
    }
}
