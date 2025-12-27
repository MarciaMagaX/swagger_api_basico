package com.example.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<Object> realizarLogin(@RequestBody LoginRequest request) {
        try {
            // 1. Validação de Dados Incorretos (Erro 400)
            if (request.getEmail() == null || request.getPassword() == null) {
                return ResponseEntity.status(400).body(new MessageResponse("Dados request enviados incorretos"));
            }

            // Simulação de banco de dados
            String emailCadastrado = "admin@example.com";
            String senhaCorreta = "123";

            // 2. Usuário não encontrado (Erro 404)
            if (!emailCadastrado.equals(request.getEmail())) {
                return ResponseEntity.status(404).body(new MessageResponse("Usuário não encontrado"));
            }

            // 3. Password incorreta (Erro 401)
            if (!senhaCorreta.equals(request.getPassword())) {
                return ResponseEntity.status(401).body(new MessageResponse("Password incorreta"));
            }

            // 4. Sucesso (Status 200)
            String tokenFicticio = "eyJhbGciOiJIUzI1Ni...";
            String dadosConta = "{\"id\":1,\"email\":\"admin@admin.com\",\"firstName\":\"First\",\"lastName\":\"Last\"}";
            return ResponseEntity.ok(new LoginResponse(tokenFicticio, dadosConta));

        } catch (Exception e) {
            // 5. Erro no servidor (Erro 500)
            return ResponseEntity.status(500).body(new MessageResponse("Erro no servidor: " + e.getMessage()));
        }
    }
}