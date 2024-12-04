package com.bibliotecasystem.biblioteca.enums;

public enum UserRoles {
    ADMIN("admin"),
    USER("usuario"),
    FUNCIONARIO("funcionario");

    private String role;

    UserRoles(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
