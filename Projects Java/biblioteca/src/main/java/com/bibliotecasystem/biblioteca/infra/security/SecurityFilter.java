package com.bibliotecasystem.biblioteca.infra.security;

import com.bibliotecasystem.biblioteca.repository.UsuarioRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {
    @Autowired
    TokenService tokenService;

    @Autowired
    UsuarioRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        var token = this.recoverToken(request);
        if (token != null ){
            System.out.println("Token recuperado: " + token); // Adicione um log para depurar o token
            var login = tokenService.validateToken(token);
            System.out.println("Login após validação do token: " + login); // Verifique o login recuperado
            UserDetails user = userRepository.findByLogin(login);

            if (user != null) {
                var authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            } else {
                System.out.println("Usuário não encontrado no banco de dados.");
            }
        }
        else {
            System.out.println("Token não encontrado na requisição.");
        }
        filterChain.doFilter(request, response);
    }

    private String recoverToken(HttpServletRequest request){
        var autoHeader = request.getHeader("Authorization");
        if (autoHeader == null) return null;
        String token = autoHeader.replace("Bearer ", "");
        System.out.println("Token recuperado: " + token); // Adicione um log para depurar o token
        return token;
    }
}
