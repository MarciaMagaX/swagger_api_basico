package com.example.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/progress")
public class ReportProgressController {

    // Simulação de uma conta para compor a resposta
    private AccountSimpleResponse mockAccount = new AccountSimpleResponse(
            1, "First", "Last", "admin@admin.com", "2000-12-10", "M"
    );

    // 1. GET /progress (Listar todos)
    @GetMapping
    public ResponseEntity<Object> listarTodos(@RequestHeader("token") String token) {
        return ResponseEntity.ok("Lista de todos os progressos recuperada");
    }

    // 2. POST /progress (Criar)
    @PostMapping
    public ResponseEntity<Object> criar(@RequestHeader("token") String token, @RequestBody ProgressRequestDTO req) {
        ProgressResponseDTO res = new ProgressResponseDTO(1, req, mockAccount);
        return ResponseEntity.status(201).body(res);
    }

    // 3. GET /progress/{id} (Buscar por ID)
    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable String id, @RequestHeader("token") Object token) {
        if ("1".equals(id)) {
            // Simulando um registro encontrado
            return ResponseEntity.ok("Progresso ID " + id + " encontrado");
        }
        return ResponseEntity.status(404).body(new MessageResponse("Recurso " + id + " não encontrado"));
    }

    // 4. PUT /progress/{id} (Atualizar)
    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable String id, @RequestBody ProgressRequestDTO req) {
        if (!"1".equals(id)) {
            return ResponseEntity.status(404).body(new MessageResponse("Recurso " + id + " não encontrado"));
        }
        return ResponseEntity.status(202).build(); // 202 Accepted conforme YAML
    }

    // 5. DELETE /progress/{id} (Excluir)
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> excluir(@PathVariable String id) {
        if (!"1".equals(id)) {
            return ResponseEntity.status(404).body(new MessageResponse("Recurso " + id + " não encontrado"));
        }
        return ResponseEntity.status(204).build(); // 204 No Content
    }
}