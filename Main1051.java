import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1051 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		input.close();

		// Formatando a saída:
		DecimalFormat formatar = new DecimalFormat("0.00");

		// Variável:
		double imposto = 0;

		// Controle de fluxo:
		if (salario <= 2000) {
			System.out.println("Isento");
		}

		if (salario > 2000 && salario <= 3000) {
			salario -= 2000; // parte isenta
			imposto = salario * 0.08;
			System.out.println("R$ " + formatar.format(imposto));
		}

		if (salario > 3000 && salario <= 4500) {
			salario -= 2000; // parte isenta
			imposto = (1000 * 0.08) + ((salario - 1000) * 0.18); // Basicamente, tributamos primeiro a faixa anterior em
			System.out.println("R$ " + formatar.format(imposto)); // seu valor completo e depois o que passou na
																	// próxima faixa.
		}

		if (salario >= 4500) {
			salario -= 2000;// parte isenta
			imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 2500) * 0.28); // Mesma lógica anterior: vamos
			System.out.println("R$ " + formatar.format(imposto)); // tributamos de acordo com o
																	// completo das faixas anteriores e
																	// excesso na faixa atual.
		}
		
		/* Por algum motivo não estava lendo essa parte:
		 * 
		 * if (salario > 2000) {
		 * System.out.println("R$ " + formatar.format(imposto));
		 * 
		 * }
		 */
	}

}
