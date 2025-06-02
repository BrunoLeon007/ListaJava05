package exercicios;

import java.util.Scanner;

public class SinalNumeroPositivoNegativo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite um número: ");
		    double numero = scanner.nextDouble();

		    String sinal = verificarSinal(numero);
		    System.out.println("O número " + numero + " é " + sinal + ".");

		    scanner.close();
		  }

		  public static String verificarSinal(double numero) {
		    if (numero > 0) {
		      return "positivo";
		    } else if (numero < 0) {
		      return "negativo";
		    } else {
		      return "zero";
		    }

		}

	}


	
