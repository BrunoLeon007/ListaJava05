package exercicios;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite seu peso (em kg): ");
	    double peso = scanner.nextDouble();

	    System.out.print("Digite sua altura (em metros): ");
	    double altura = scanner.nextDouble();

	    double imc = calcularIMC(peso, altura);
	    String classificacao = classificarIMC(imc);

	    System.out.println("Seu IMC é: " + String.format("%.2f", imc));
	    System.out.println("Classificação: " + classificacao);

	    scanner.close();
	  }

	  public static double calcularIMC(double peso, double altura) {
	    return peso / (altura * altura);
	  }

	  public static String classificarIMC(double imc) {
	    if (imc < 18.5) {
	      return "Magreza";
	    } else if (imc < 25) {
	      return "Normal";
	    } else if (imc < 30) {
	      return "Sobrepeso";
	    } else if (imc < 35) {
	      return "Obesidade Grau I";
	    } else if (imc < 40) {
	      return "Obesidade Grau II";
	    } else {
	      return "Obesidade Grau III";
	    }
	  }
	

	}




	


