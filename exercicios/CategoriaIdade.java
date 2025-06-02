package exercicios;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite sua idade: ");
		    int idade = scanner.nextInt();

		    String categoria = obterCategoria(idade);
		    System.out.println("Categoria: " + categoria);

		    scanner.close();
		  }

		  public static String obterCategoria(int idade) {
		    if (idade <= 12) {
		      return "Criança";
		    } else if (idade <= 17) {
		      return "Adolescente";
		    } else if (idade <= 64) {
		      return "Adulto";
		    } else {
		      return "Idoso";
		    }

		}

}
