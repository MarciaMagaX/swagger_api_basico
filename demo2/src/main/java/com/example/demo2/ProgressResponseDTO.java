package com.example.demo2;

import java.math.BigDecimal;

public class ProgressResponseDTO {
    public Integer id;
    public BigDecimal height;
    public BigDecimal weight;
    public BigDecimal headCircunference;
    public String dateProgress;
    public AccountSimpleResponse account; // Objeto aninhado conforme o YAML

    public ProgressResponseDTO(Integer id, ProgressRequestDTO req, AccountSimpleResponse account) {
        this.id = id;
        this.height = req.height;
        this.weight = req.weight;
        this.headCircunference = req.headCircunference;
        this.dateProgress = req.dateProgress;
        this.account = account;
    }
}

// Classe auxiliar para o objeto 'account' dentro da resposta de progresso
class AccountSimpleResponse {
    public Integer id;
    public String firstName;
    public String lastName;
    public String email;
    public String dateBirth;
    public String gender;

    public AccountSimpleResponse(Integer id, String firstName, String lastName, String email, String dateBirth, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateBirth = dateBirth;
        this.gender = gender;
    }
}
