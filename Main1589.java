import java.util.Scanner;

public class Main1589 {
	public static void main(String[] args) {
		// Entrada (qtd testes):
		Scanner input = new Scanner(System.in);
		int qtdTeste = input.nextInt();

		// Duplas de valores:
		int valueUm = 0, valueDois = 0;

		// Armazenador:
		int acumulador = 0;

		if (qtdTeste <= 10000) {
			for (int i = 0; i < qtdTeste; i++) {
				valueUm = input.nextInt();
				valueDois = input.nextInt(); // Me pede a dupla de entradas de acordo com a qtd de testes.
				acumulador = valueUm + valueDois; // Para cada qtd de testes, ele vai executar essa nova atribuição
													// 'qtdTeste' vezes.
				System.out.println(acumulador); // Imprime para cada 'qtdTeste'.
			}
		}
	}

}
