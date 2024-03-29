import java.util.Scanner;

public class Main2413 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		int qtdTerceiro = input.nextInt();
		input.close();

		// Variável procurada:
		int qtdPrimeiro = ((qtdTerceiro * 2) * 2); // Primeiro eu achei a qtd de pessoas que clicaram no segundo link.
													// Depois achei a qtd de pessoas que clicaram no primeiro.

		// Saída:
		System.out.println(qtdPrimeiro);

	}

}
