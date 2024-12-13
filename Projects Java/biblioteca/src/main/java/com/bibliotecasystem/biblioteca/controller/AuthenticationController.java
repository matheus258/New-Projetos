package com.bibliotecasystem.biblioteca.controller;

import com.bibliotecasystem.biblioteca.dto.LoginResponseDTO;
import com.bibliotecasystem.biblioteca.infra.security.TokenService;
import com.bibliotecasystem.biblioteca.dto.AuthenticationDTO;
import com.bibliotecasystem.biblioteca.dto.RegisterDTO;
import com.bibliotecasystem.biblioteca.model.Usuario;
import com.bibliotecasystem.biblioteca.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private TokenService tokenService;

    // Endpoint de login
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);  // Autentica o usuário

        // Gera um novo token para o usuário
        var token = tokenService.generateToken((Usuario) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));  // Retorna o token no corpo da resposta
    }

    // Endpoint de registro
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
        // Verifica se o login já existe no banco
        if (this.repository.findByLogin(data.login()) != null) {
            return ResponseEntity.badRequest().build();  // Se já existe, retorna erro
        }

        // Criptografa a senha
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.senha());

        // Cria o novo usuário
        Usuario newUser = new Usuario(
                data.nome(),
                data.email(),
                data.telefone(),
                data.login(),
                encryptedPassword,
                data.role()
        );

        // Salva o novo usuário no banco de dados
        this.repository.save(newUser);

        return ResponseEntity.ok().build();  // Retorna sucesso
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refreshToken(@RequestBody Map<String, String> request) {
        String refreshToken = request.get("refreshToken");
        try {
            String newToken = tokenService.refreshToken(refreshToken);
            return ResponseEntity.ok(Map.of("token", newToken));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid refresh token");
        }
    }

}
