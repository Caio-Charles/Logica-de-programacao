import java.util.Scanner;

public class Main2374 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		int desejada = input.nextInt();
		int lida = input.nextInt();
		input.close();

		// Variável procurada:
		int diferenca = 0;

		// Se a lida for menor que a desejada, completa.
		if (desejada > lida) {
			diferenca = desejada - lida; // Encher++
		}

		// Se a desejada for menor que a lida, esvazia.
		if (desejada < lida) {
			diferenca = desejada - lida; // Esvaziar--
		}

		System.out.println(diferenca);
	}

}
