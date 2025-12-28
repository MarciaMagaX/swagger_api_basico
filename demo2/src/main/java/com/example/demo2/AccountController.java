package com.example.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    // 1. GET /accounts (Listar todos)
    @GetMapping
    public ResponseEntity<Object> listarContas(@RequestHeader("token") String token) {
        return ResponseEntity.ok("Lista de contas simulada");
    }

    // 2. POST /accounts (Criar)
    @PostMapping
    public ResponseEntity<Object> criar(@RequestHeader("token") String token, @RequestBody AccountRequestDTO req) {
        return ResponseEntity.status(201).body(new AccountResponseDTO(1, req));
    }

    // 3. GET /accounts/{id} (Buscar por ID)
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscar(@PathVariable String id, @RequestHeader("token") String token) {
        if ("1".equals(id)) {
            return ResponseEntity.ok("Conta encontrada");
        }
        return ResponseEntity.status(404).body("Recurso " + id + " não encontrado");
    }

    // 4. PUT /accounts/{id} (Atualizar)
    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable String id,
                                            @RequestHeader("token") String token,
                                            @RequestBody AccountRequestDTO req) {
        if (!"1".equals(id)) {
            return ResponseEntity.status(404).body("Recurso " + id + " não encontrado");
        }
        // Retorna 202 Accepted conforme seu YAML
        return ResponseEntity.status(202).build();
    }

    // 5. DELETE /accounts/{id} (Excluir)
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable String id, @RequestHeader("token") String token) {
        if (!"1".equals(id)) {
            return ResponseEntity.status(404).body("Recurso " + id + " não encontrado");
        }
        // Retorna 204 No Content conforme seu YAML
        return ResponseEntity.status(204).build();
    }
}


