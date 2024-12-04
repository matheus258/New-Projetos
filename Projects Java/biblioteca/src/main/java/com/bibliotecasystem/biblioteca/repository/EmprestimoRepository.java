package com.bibliotecasystem.biblioteca.repository;

import com.bibliotecasystem.biblioteca.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    List<Emprestimo> findByDataDevolucaoBeforeAndDataDevolucaoNotNull(LocalDate data);
}
