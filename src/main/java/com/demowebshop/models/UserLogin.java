package com.demowebshop.models;

public class UserLogin {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public UserLogin setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserLogin setPassword(String password) {
        this.password = password;
        return this;
    }
}