package banco;

import java.util.Locale;
import java.util.Scanner;

import modelos.Conta;

public class Banco {

	private static final String String = null;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float operation;
		double valorDinheiro;
		int x = 0;
		String name;
		String cpf; 
		
		System.out.println("Digite o seu primeiro nome: ");
		name = sc.next();
		System.out.println("Digite o CPF da conta: ");
		cpf = sc.next();
		
		Conta a = new Conta(name,cpf);


		
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
				
			}
			else if (operation == 5) {
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
