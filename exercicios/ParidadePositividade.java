package exercicios;

import java.util.Scanner;

public class ParidadePositividade {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite um número inteiro: ");
		    int numero = scanner.nextInt();

		    String paridade = verificarParidade(numero);
		    String sinal = verificarSinal(numero);

		    System.out.println("O número " + numero + " é " + paridade + " e " + sinal + ".");

		    scanner.close();
		  }

		  public static String verificarParidade(int numero) {
		    if (numero % 2 == 0) {
		      return "par";
		    } else {
		      return "ímpar";
		    }
		  }

		  public static String verificarSinal(int numero) {
		    if (numero > 0) {
		      return "positivo";
		    } else if (numero < 0) {
		      return "negativo";
		    } else {
		      return "zero";
		    }

		}

	}


	
