package com.soulcode.goserviceapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.soulcode.goserviceapp.domain.Usuario;
import com.soulcode.goserviceapp.repository.UsuarioRepository;

@Service
public class UserSecurityService implements UserDetailsService {
   @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional <Usuario> result = usuarioRepository.findByEmail(username);
        if(result.isPresent()){
            System.out.println(result.get());
            return result.get();
        }
        throw new UsernameNotFoundException("Usuário não encontrado");
    }
    
}
