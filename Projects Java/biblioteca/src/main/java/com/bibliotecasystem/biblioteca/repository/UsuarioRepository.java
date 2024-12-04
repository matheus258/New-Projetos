package com.bibliotecasystem.biblioteca.repository;

import com.bibliotecasystem.biblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
