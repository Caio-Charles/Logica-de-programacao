import java.util.Scanner;

public class Main1078 {
	public static void main(String[] arg) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();

		if ((number > 2) && (number < 1000)) { // Verifica se a entrada faz parte do intervalo.
			for (int multiplicador = 1; multiplicador < 11; multiplicador++) { // Basicamente faz uma contagem de 1 a
																				// 10.
				int resultado = (number * multiplicador); // Variável local cuja função é armazenar o produto de
															// 'multiplicador' pela entrada 'number'.
				System.out.println(multiplicador + " x " + number + " = " + resultado);
			}
		}

	}

}
