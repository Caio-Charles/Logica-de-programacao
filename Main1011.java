import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1011 {
	public static void main(String[] args) {
		// Constantes:
		final double PI = 3.14159;

		// Entrada:
		Scanner input = new Scanner(System.in);
		double raio = input.nextDouble();
		input.close();

		// Processamento:
		double volumeEsfera = ((4.0 / 3.0) * PI * (raio * raio * raio));

		// Formatando a saída:
		DecimalFormat f = new DecimalFormat("0.000");

		// Saída:
		System.out.println("VOLUME = " + f.format(volumeEsfera));
	}

}
