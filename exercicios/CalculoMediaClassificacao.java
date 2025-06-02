package exercicios;

import java.util.Scanner;

public class CalculoMediaClassificacao {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite a nota 1: ");
		    double nota1 = scanner.nextDouble();

		    System.out.print("Digite a nota 2: ");
		    double nota2 = scanner.nextDouble();

		    System.out.print("Digite a nota 3: ");
		    double nota3 = scanner.nextDouble();

		    double media = calcularMedia(nota1, nota2, nota3);
		    String classificacao = classificarMedia(media);

		    System.out.println("Média: " + String.format("%.2f", media));
		    System.out.println("Classificação: " + classificacao);

		    scanner.close();
		  }

		  public static double calcularMedia(double nota1, double nota2, double nota3) {
		    return (nota1 + nota2 + nota3) / 3;
		  }

		  public static String classificarMedia(double media) {
		    if (media >= 7) {
		      return "Aprovado";
		    } else if (media >= 4) {
		      return "Recuperação";
		    } else {
		      return "Reprovado";
		    }
		  }
		

		}




	


