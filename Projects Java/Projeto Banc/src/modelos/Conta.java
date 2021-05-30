package modelos;

public class Conta {
	
	double saldo;
	String conta;
	
	String name;
	String cpf;
	
	/*
	public Conta(String name, String cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}
	*/
	
	
	
	public Conta( String name, String cpf) {
		saldo = 0;
		this.name = name;
		this.cpf = cpf;
	}
	
	public void depositar(double deposito ) {
		saldo += deposito;
	}
	
	public void sacar(double sacar) {
		if (saldo >= sacar) {
			saldo -= sacar;}
		else {
			System.out.println("ERRO: Saldo insuficiente");
		}
	}
	
	public String toString() {
		return "Saldo R$: "+saldo;
	}
	
	public void menu() {
		
		System.out.println("________________________");
		System.out.println();
		System.out.println("Selecione a operação que deseja realizar: ");
		System.out.println();
		System.out.println(" 1 para depositar.");
		System.out.println(" 2 para sacar.");
		System.out.println(" 3 para ver o saldo.");
		System.out.println(" 4 para informar dados da conta.");
		System.out.println(" 5 para sair. ");
	}
}
