import java.util.Scanner;

public class Main1073 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();

		// Controle de fluxo:
		if ((n > 5) && (n < 2000)) { // Verifica se n pertence ao intervalo.
			for (int i = 1; i < n + 1; i++) { // Basicamente conta todos os números de 1 a n.
				if (i % 2 == 0) {// Cria-se uma forma de verificar quais deles são pares.
					int temporario = i * i;// Variável temporária, cuja função é elevar os pares ao quadrado a cada
											// passagem do contador.
					System.out.println(i + "^2 = " + temporario);// Imprime a cada passagem.
				}
			}
		}

	}

}