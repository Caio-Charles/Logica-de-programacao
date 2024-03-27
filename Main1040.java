import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1040 {

	public static void main(String[] args) {
		// Notas do aluno:
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble(), d = input.nextDouble();

		// Calculando a média e criando notaExame:
		double media = (((a * 2) + (b * 3) + (c * 4) + (d)) / 10);
		double notaExame = 0;

		// Criando um formatador de saída:
		DecimalFormat toFormatOutput = new DecimalFormat("0.0");

		// Mostrando a média:
		System.out.println("Media: " + toFormatOutput.format(media));

		// Controle de fluxo:
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}

		if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}

		if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			for (int i = 0; i < 1; i++) {
				notaExame = input.nextDouble();
				System.out.println("Nota do exame: " + toFormatOutput.format(notaExame));
				media = (media + notaExame) / 2;
				if (media > 5.0) {
					System.out.println("Aluno aprovado.");
					System.out.println("Media final: " + toFormatOutput.format(media));
				} else {
					System.out.println("Aluno reprovado.");
					System.out.println("Media final: " + toFormatOutput.format(media));
				}
			}
		}
		input.close();
	}

}
