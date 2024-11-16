package br.com.alunonet.Enums;

public enum StatusCurso {
	ATIVO("Ativo"),
	INATIVO("Inativo"),
	TRANCADO("Trancado"),
	CANCELADO("Cancelado");
	
	private String status;
	
	private StatusCurso(String status){
		this.status = status;
	}
	
    
}
