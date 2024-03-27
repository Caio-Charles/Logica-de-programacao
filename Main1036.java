import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1036 {
	public static void main(String[] arg) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		input.close();

		// Processamento:
		double delta = Math.pow(b, 2) + (-4 * (a * c));
		double raizDelta = Math.sqrt(delta); // Só calcula se delta for positivo.
		double raizUm = (((-b) + raizDelta) / (2 * a));
		double raizDois = (((-b) - raizDelta) / (2 * a));

		// Formatando a saída:
		DecimalFormat toFormatOutput = new DecimalFormat("0.00000");

		// Controle de fluxo:

		if ((delta > 0) && (a != 0)) {
			System.out.println("R1 = " + toFormatOutput.format(raizUm));
			System.out.println("R2 = " + toFormatOutput.format(raizDois));
		}

		if (delta < 0) {
			System.out.println("Impossivel calcular");
		}

		if (a == 0) {
			System.out.println("Impossivel calcular");
		}
	}
}