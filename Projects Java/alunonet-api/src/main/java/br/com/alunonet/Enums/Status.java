package br.com.alunonet.Enums;

public enum Status {
	ATIVO("Ativo"),
	INATIVO("Inativo"),
	TRANCADO("Trancado"),
	CANCELADO("Cancelado");
	
	private String status;
	
	private Status (String status) {
		this.status = status;
	}
}
