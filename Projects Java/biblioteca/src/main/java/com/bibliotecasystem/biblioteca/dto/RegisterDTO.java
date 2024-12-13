package com.bibliotecasystem.biblioteca.dto;

import com.bibliotecasystem.biblioteca.enums.UserRoles;

public record RegisterDTO(String nome, String email, String telefone, String login, String senha, UserRoles role) {
}
