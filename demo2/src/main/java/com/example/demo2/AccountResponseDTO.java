package com.example.demo2;

public class AccountResponseDTO {
    public Integer id;
    public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String dateBirth;
    public String gender;

    public AccountResponseDTO(Integer id, AccountRequestDTO req) {
        this.id = id;
        this.firstName = req.firstName;
        this.lastName = req.lastName;
        this.email = req.email;
        this.phoneNumber = req.phoneNumber;
        this.dateBirth = req.dateBirth;
        this.gender = req.gender;
    }
}
