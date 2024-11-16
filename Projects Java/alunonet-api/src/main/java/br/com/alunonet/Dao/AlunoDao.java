package br.com.alunonet.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alunonet.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

}
