package banco;

import java.util.Locale;
import java.util.Scanner;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;
		float operation;
		double valorDinheiro;
		String name;
		String cpf; 
		int numCont;
		
		System.out.print("Digite o seu nome completo: ");
		name = sc.nextLine();
		System.out.print("Digite o CPF da conta: ");
		cpf = sc.next();
		System.out.print("Digite o número da conta: ");
		numCont = sc.nextInt();
		Conta a = new Conta(name,cpf, numCont);
		
		System.out.println();
		System.out.println("Bem vindo ao sistema!");
		while (x == 0) {
			
			a.menu();
			
			operation = sc.nextFloat();

			if (operation == 1) {
				System.out.println("Qual o valor que deseja depositar? ");
				valorDinheiro = sc.nextDouble();
				a.depositar(valorDinheiro);
				System.out.println(a.toString());
				System.out.println();
			}

			else if (operation == 2) {
				System.out.println("Qual o valor que deseja sacar? ");
				valorDinheiro = sc.nextDouble();
				a.sacar(valorDinheiro);
				System.out.println(a.toString());
				System.out.println();
			}

			else if (operation == 3) {
				System.out.println(a.toString());
				System.out.println();
			}
			
			else if (operation == 4) {
				System.out.println("Dados Cadastrados: ");
				System.out.println();
				System.out.println("NOME: "+name);
				System.out.println("CPF: "+cpf);
				System.out.println("CONTA: "+numCont);
			}
			
			else if (operation == 5) {
				System.out.println();
				System.out.println("Obrigado por utilizar nosso sistema.");
				System.out.println();
				break; 
			}
			
			else {
				System.out.println("Operação não existente!!");
			}

		}

		sc.close();
	}

}
