package com.bibliotecasystem.biblioteca.dto;

import com.bibliotecasystem.biblioteca.enums.UserRoles;

public record RegisterDTO(String login, String senha, UserRoles role) {
}
