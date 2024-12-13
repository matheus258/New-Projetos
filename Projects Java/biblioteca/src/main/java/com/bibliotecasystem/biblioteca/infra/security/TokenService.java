package com.bibliotecasystem.biblioteca.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bibliotecasystem.biblioteca.model.Usuario;
import com.bibliotecasystem.biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String secret;

    @Autowired
    private UsuarioRepository userRepository; // Injeção do repositório

    // Geração de token
    public String generateToken(Usuario usuario) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("auth-api")
                    .withSubject(usuario.getLogin())
                    .withExpiresAt(genExpirationDate())
                    .sign(algorithm);
        } catch (JWTVerificationException exception) {
            throw new RuntimeException("Erro ao gerar token", exception);
        }
    }

    // Validação do token
    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            var decodedJWT = JWT.require(algorithm)
                    .withIssuer("auth-api")
                    .build()
                    .verify(token);

            // Verifica se o token expirou
            if (decodedJWT.getExpiresAt().before(new Date())) {
                System.out.println("Token expirado. Gerando novo token.");
                return generateNewToken(decodedJWT.getSubject()); // Gera um novo token
            }

            return decodedJWT.getSubject(); // Retorna o sujeito (usuário) do token
        } catch (JWTVerificationException exception) {
            System.out.println("Erro na validação do token: " + exception.getMessage());
            throw new RuntimeException("Token inválido", exception);
        }
    }

    // Geração de um novo token (se o antigo expirou)
    private String generateNewToken(String username) {
        // Busca o usuário no banco de dados pelo login
        Usuario usuario = (Usuario) userRepository.findByLogin(username);
        if (usuario == null) {
            throw new RuntimeException("Usuário não encontrado para renovação do token");
        }
        return generateToken(usuario); // Gera um novo token para o usuário
    }


    // Define a expiração do token
    private Instant genExpirationDate() {
        return LocalDateTime.now().plusHours(1).toInstant(ZoneOffset.of("-03:00")); // Token válido por 1 hora
    }
}
