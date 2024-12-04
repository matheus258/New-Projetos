package com.bibliotecasystem.biblioteca.repository;

import com.bibliotecasystem.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
