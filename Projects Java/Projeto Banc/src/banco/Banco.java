package banco;

import java.util.Locale;
import java.util.Scanner;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta a = new Conta("Conta 1");

		float operation;
		double valorDinheiro;
		int x = 0;

		
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
