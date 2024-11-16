package br.com.alunonet.model;


import br.com.alunonet.Enums.Curso;
import br.com.alunonet.Enums.Estado;
//import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "curso")
	@Enumerated(EnumType.STRING)
	private Curso curso ;
	
	@Column(name = "matricula")
	private String matricula;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estado")
	private Estado estado;
	
	@Column(name = "turno")
	private String turno;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Estado getEstado() {
	    return estado;
	}

	public void setEstado(Estado estado) {
	    this.estado = estado;
	}
	

}
