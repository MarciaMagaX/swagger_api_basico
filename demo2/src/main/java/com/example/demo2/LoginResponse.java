package com.example.demo2;

public class LoginResponse {
    private String token;
    private String account;

    public LoginResponse(String token, String account) {
        this.token = token;
        this.account = account;
    }

    // Getters e Setters
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getAccount() { return account; }
    public void setAccount(String account) { this.account = account; }
}
