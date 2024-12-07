package com.bibliotecasystem.biblioteca.controller;

import com.bibliotecasystem.biblioteca.dto.LoginResponseDTO;
import com.bibliotecasystem.biblioteca.infra.security.TokenService;
import com.bibliotecasystem.biblioteca.dto.AuthenticationDTO;
import com.bibliotecasystem.biblioteca.dto.RegisterDTO;
import com.bibliotecasystem.biblioteca.model.Usuario;
import com.bibliotecasystem.biblioteca.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = tokenService.generateToken((Usuario) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data ){
        // Verifica login no banco
        if (this.repository.findByLogin(data.login()) != null) return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.senha());
        Usuario newUser = new Usuario(data.login(), encryptedPassword, data.role());

        this.repository.save(newUser);

        return ResponseEntity.ok().build();
    }

}
