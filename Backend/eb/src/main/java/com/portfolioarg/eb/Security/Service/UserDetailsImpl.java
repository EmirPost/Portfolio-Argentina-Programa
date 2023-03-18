package com.portfolioarg.eb.Security.Service;

import com.portfolioarg.eb.Security.entity.MainUser;
import com.portfolioarg.eb.Security.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserDetailsImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario =usuarioService.getByNombreUsuario(nombreUsuario).get();
        return MainUser.build(usuario);
    }   
    
}
