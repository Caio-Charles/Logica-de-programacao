import java.util.Scanner;

public class Main1113 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(), y = input.nextInt();

		do {
			if (x < y) { // Se o primeiro valor digitado, for menor que o segundo valor digitado...
				System.out.println("Crescente");
			}

			if (x > y) { // Se o 1º valor for maior que o 2º valor...
				System.out.println("Decrescente");
			}

			x = input.nextInt(); // Peça novos valores enquanto X!=Y.
			y = input.nextInt();

		} while (x != y);

		if (x == y) { // Se forem digitados dois valores iguais, nada acontece :).
		}
	}
}
