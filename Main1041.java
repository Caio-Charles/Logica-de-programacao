import java.util.Scanner;

public class Main1041 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble(), y = input.nextDouble();
		input.close();

		// Controle de fluxo:
		if (x == 0 && y == 0) { // Origem
			System.out.println("Origem");
		}

		if (x == 0 && (y > 0 || y < 0)) { // Eixo y
			System.out.println("Eixo Y");
		} else if (y == 0 && (x > 0 || x < 0)) { // Eixo x
			System.out.println("Eixo X");
		}

		if (x > 0 && y > 0) { // Q1
			System.out.println("Q1");
		}
		if (x < 0 && y > 0) { // q2
			System.out.println("Q2");
		}
		if (x < 0 && y < 0) { // q3
			System.out.println("Q3");
		}
		if (x > 0 && y < 0) { // q4
			System.out.println("Q4");
		}
	}// main

}
