import java.util.Scanner;

public class Main2840 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int raio = input.nextInt(), litro = input.nextInt();
		input.close();

		// Constante e variável:
		final double PI = 3.1415;
		int volume = 0;
		int qtdBalao = 0;

		// Processamento:
		volume = (int) ((PI * Math.pow(raio, 3) * 4) / 3); // Atribuir apenas a parte inteira.
		qtdBalao = litro / volume;

		// Saída:
		System.out.println(qtdBalao);
	}

}
