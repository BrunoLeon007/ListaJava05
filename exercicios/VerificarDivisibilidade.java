package exercicios;

import java.util.Scanner;

public class VerificarDivisibilidade {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite um número: ");
		    int numero = scanner.nextInt();

		    boolean divisivelPor3 = verificarDivisibilidadePor3(numero);
		    boolean divisivelPor5 = verificarDivisibilidadePor5(numero);

		    if (divisivelPor3 && divisivelPor5) {
		      System.out.println("O número " + numero + " é divisível por 3 e por 5.");
		    } else if (divisivelPor3) {
		      System.out.println("O número " + numero + " é divisível por 3, mas não por 5.");
		    } else if (divisivelPor5) {
		      System.out.println("O número " + numero + " é divisível por 5, mas não por 3.");
		    } else {
		      System.out.println("O número " + numero + " não é divisível por 3 e nem por 5.");
		    }

		    scanner.close();
		  }

		  public static boolean verificarDivisibilidadePor3(int numero) {
		    return numero % 3 == 0;
		  }

		  public static boolean verificarDivisibilidadePor5(int numero) {
		    return numero % 5 == 0;

		}

	}
	

