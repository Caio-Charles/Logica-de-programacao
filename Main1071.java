import java.util.Scanner;

public class Main1071 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(), y = input.nextInt();
		input.close();

		// Controlador de repetição:
		int controlador = 0;

		// Acumulador de soma:
		int soma = 0;

		// Controle de fluxo:
		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		if (x > y) {
			for (int i = y + 1; i < x; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		if (x == y) {
			System.out.println(soma);
		}

		// Repetidor imbutido:
		if (x < y || x > y) {
			while (controlador < 1) {
				System.out.println(soma);
				controlador++;
			}
		}
	}// main
}