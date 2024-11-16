package br.com.alunonet.Enums;

public enum Status {
	ATIVO("Ativo"),
	INATIVO("Inativo"),
	TRANCADO("Trancado"),
	CANCELADO("Cancelado");
	
	private String status;
	
	Status(String status){
		this.status = status;
	}
	
    public String getStatus() {
        return status;
    }
}
