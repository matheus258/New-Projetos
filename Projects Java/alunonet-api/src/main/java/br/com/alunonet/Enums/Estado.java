package br.com.alunonet.Enums;

public enum Estado {
	ATIVO("Ativo"),
	INATIVO("Inativo"),
	TRANCADO("Trancado"),
	CANCELADO("Cancelado");
	
	private String estado;
	
	private Estado(String estado) {
		this.estado = estado;
	}
}
