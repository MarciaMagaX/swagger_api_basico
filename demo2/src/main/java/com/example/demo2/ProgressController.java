package com.example.demo2;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@RestController
@RequestMapping("/accounts")
public class ProgressController {

    @GetMapping("/{email}/progress")
    public ResponseEntity<Object> getProgress(
            @PathVariable("email") String email,
            @RequestHeader("token") String token) {

        try {

            String myToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
            // 1. Simulação de validação de token (Erro 401)
            if (token == null || token.isEmpty() || !token.equals(myToken)) {
                return ResponseEntity.status(401).body(new MessageResponse("Token inválido, inexistente ou expirado"));
            }

            // 2. Simulação de busca por email (Erro 404)
            if (!email.equals("admin@admin.com")) {
                return ResponseEntity.status(404).body(new MessageResponse("Recurso " + email + " não encontrado"));
            }

            // 3. Sucesso - Retornando dados fictícios baseados no seu JSON
            ProgressResponse mockProgress = new ProgressResponse(
                    new BigDecimal("1.02"),
                    new BigDecimal("45"),
                    new BigDecimal("0.48"),
                    "2023-10-25"
            );

            return ResponseEntity.ok(mockProgress);

        } catch (Exception e) {
            // 4. Erro no servidor (Erro 500)
            return ResponseEntity.status(500).body(new MessageResponse("Erro no servidor"));
        }
    }
}
