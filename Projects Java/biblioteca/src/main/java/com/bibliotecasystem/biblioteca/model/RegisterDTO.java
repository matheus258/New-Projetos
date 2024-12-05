package com.bibliotecasystem.biblioteca.model;

import com.bibliotecasystem.biblioteca.enums.UserRoles;

public record RegisterDTO(String login, String senha, UserRoles role) {
}
