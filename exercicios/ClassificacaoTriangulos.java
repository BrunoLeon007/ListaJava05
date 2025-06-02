package exercicios;

import java.util.Scanner;

public class ClassificacaoTriangulos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite o comprimento do lado A: ");
	    double ladoA = scanner.nextDouble();

	    System.out.print("Digite o comprimento do lado B: ");
	    double ladoB = scanner.nextDouble();

	    System.out.print("Digite o comprimento do lado C: ");
	    double ladoC = scanner.nextDouble();

	    if (ladoA == ladoB && ladoB == ladoC) {
	      System.out.println("O triângulo é equilátero.");
	    } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
	      System.out.println("O triângulo é isósceles.");
	    } else {
	      System.out.println("O triângulo é escaleno.");
	    }

	    scanner.close();
	  }
	
}


