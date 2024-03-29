
/* Volta à Faculdade de Física: deu errado */
import java.util.Scanner;

public class Main1197 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int v, t;
		int deslocamento = 0;

		while ((v = input.nextInt()) >= -100 && (t = input.nextInt()) >= -100) {
			if (v > 100 || t > 100) { // Digitou valores não aceitos. o laço é quebrado.
				break;
			}
			deslocamento = v * (2 * t);
			System.out.println(deslocamento);
		}

	}

}
