import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1010 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		int codigoPeca1 = input.nextInt(), qtdPeca1 = input.nextInt();
		double valorUnitario1 = input.nextDouble();
		int codigoPeca2 = input.nextInt(), qtdPeca2 = input.nextInt();
		double valorUnitario2 = input.nextDouble();
		input.close();

		// Processamento:
		double valorTotal = ((qtdPeca1 * valorUnitario1) + (qtdPeca2 * valorUnitario2));

		// Formatando a saída:
		DecimalFormat formatar = new DecimalFormat("0.00");

		// Saída:
		System.out.println("VALOR A PAGAR: R$ " + formatar.format(valorTotal));
	}
}