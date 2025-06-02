package exercicios;

import java.util.Scanner;

public class Anobissexto {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite um ano: ");
		    int ano = scanner.nextInt();

		    if (anoBissexto(ano)) {
		      System.out.println(ano + " é um ano bissexto.");
		    } else {
		      System.out.println(ano + " não é um ano bissexto.");
		    }

		    scanner.close();
		  }

		  public static boolean anoBissexto(int ano) {
		    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
		  }
		


		}



	


