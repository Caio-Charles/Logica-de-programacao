import java.util.Scanner;

public class Main1060 {
	public static void main(String[] arg) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		// Criando uma variável para contabilizar os números positivos:
		int contadorPositivo = 0;

		// Laço "for", que irá repetir a instrução de "Scanner" 6 vezes:
		for (int a = 0; a < 6; a++) {
			double num = input.nextDouble();

			if (num > 0) { // A cada passagem, se o número for positivo, ele faz um incrimento na variável
							// 'contadorPositivo'.
				contadorPositivo++;
			}
		}
		input.close();
		System.out.println(contadorPositivo+" valores positivos");
	}
}