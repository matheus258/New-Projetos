package com.bibliotecasystem.biblioteca.repository;

import com.bibliotecasystem.biblioteca.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
