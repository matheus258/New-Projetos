package modelos;

public class Conta {
	
	String conta;
	double saldo;	
	String name;
	String cpf;
	int numCont;
	
	public Conta() {
		
	}
	
	public Conta( String name, String cpf, int numCont) {
		saldo = 0;
		this.name = name;
		this.cpf = cpf;
		this.numCont = numCont;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public int getNumCont() {
		return numCont;
	}


	//Métodos para o Programa 
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
