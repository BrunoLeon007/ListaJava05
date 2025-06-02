package exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite um número inteiro: ");
	    int numero = scanner.nextInt();

	    boolean ePrimo = verificarPrimo(numero);

	    if (ePrimo) {
	      System.out.println("O número " + numero + " é primo.");
	    } else {
	      System.out.println("O número " + numero + " não é primo.");
	    }

	    scanner.close();
	  }

	  public static boolean verificarPrimo(int numero) {
	    if (numero <= 1) {
	      return false;
	    }

	    for (int inteiro = 2; inteiro <= Math.sqrt(numero); inteiro++) {
	      if (numero % inteiro == 0) {
	        return false;
	      }
	    }

	    return true;
	  }
	

	}