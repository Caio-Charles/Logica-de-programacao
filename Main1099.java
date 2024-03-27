import java.util.Scanner;

public class Main1099 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int qtdTestes = input.nextInt();

		for (int i = 0; i < qtdTestes; i++) { // Pedindo para inserir um par de entradas "qtdTestes" vezes.
			int x = input.nextInt(), y = input.nextInt();
			int somaImpares = 0; // Vou poder usar ela para armazenar as somas que ocorrerão a seguir:

			if (x < y) { // Quando X for MENOR que Y, quero que...
				for (int q = x + 1; q < y; q++) { // Ele "liste" todos os que estão no intervalo ]x,y[
					if (q % 2 != 0) { // Daqueles que foram listados como elementos pertencentes ao intervalo, quero
										// que apenas os que são ímpares sejam avaliados:
						somaImpares += q; // Pegue cada número ímpar do intervalo e atribua-o à variável somaImpares,
											// que abri lá em cima.
					}
				}
			} else { // Quando eu nego que X é MENOR que Y, digo então que X é MAIOR ou IGUAL a Y:
				for (int j = y + 1; j < x; j++) { // Liste para mim aqueles que estão dentro do intervalo ]X,Y[. No caso
													// de X == Y, aquela condição resta falsa, ele contabiliza 0 na
													// passagem.
					if (j % 2 != 0) { // Daqueles que são elementos do intervalo, pegue apenas os ímpares.
						somaImpares += j; // Cada ímpar do intervalo deve ser atribuído à somaImpares.
					}
				}
			}
			System.out.println(somaImpares); // Imprima a soma dos ímpares na tela de acordo com a qtdTestes e os pares
												// de entrada solicitados!
		} // Primeiro for
	}// Main
}