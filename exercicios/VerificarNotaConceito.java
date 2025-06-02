package exercicios;

import java.util.Scanner;

public class VerificarNotaConceito {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite uma nota de 0 a 100: ");
		    double nota = scanner.nextDouble();

		    if (nota < 0 || nota > 100) {
		      System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 100.");
		    } else {
		      String conceito = obterConceito(nota);
		      System.out.println("Conceito: " + conceito);
		    }

		    scanner.close();
		  }

		  public static String obterConceito(double nota) {
		    if (nota >= 90) {
		      return "A";
		    } else if (nota >= 80) {
		      return "B";
		    } else if (nota >= 70) {
		      return "C";
		    } else if (nota >= 60) {
		      return "D";
		    } else {
		      return "F";
		    }

		}

	}


	


