package modelos;

public class Conta {
	
	double saldo;
	String conta;
	String name;
	
	public Conta(String conta) {
		saldo = 0;
		this.conta = conta;
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
		System.out.println("Bem vindo ao sistema!");
		System.out.println();
		System.out.println("Selecione a operação que deseja realizar: ");
		System.out.println();
		System.out.println(" 1 para depositar.");
		System.out.println(" 2 para sacar.");
		System.out.println(" 3 para ver o saldo.");
		System.out.println(" 4 para sair. ");
	}
}
