package tech.lastbox.controllers;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.web.bind.annotation.*;
import tech.lastbox.dtos.LoginRequest;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@RestController
public class AuthController {

    private String secretKey = "mySecretKey"; // A chave secreta deve ser guardada com segurança

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        /*
        Validação de credenciais simples.
        Em um sistema real, você faria isso com um serviço de autenticação.
        */
        if ("user".equals(loginRequest.username()) && "password".equals(loginRequest.password())) {
            // Se as credenciais forem válidas, cria o JWT
            return generateToken(loginRequest.username());
        } else {
            throw new RuntimeException("Credenciais inválidas");
        }
    }

    private String generateToken(String username) {
        return JWT.create()
                .withSubject(username)
                .withIssuedAt(Instant.now())
                .withExpiresAt(Instant.now().plus(1, ChronoUnit.HOURS))  // Expiração em 1 hora
                .sign(Algorithm.HMAC256(secretKey));
    }
}