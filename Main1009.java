import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1009 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		String nomeFuncionario = input.next();
		double salarioFixo = input.nextDouble(), totalVendas = input.nextDouble();
		input.close();

		// Processamento:
		double salarioFinal = (totalVendas * 0.15) + salarioFixo;

		// Formatando a saída:
		DecimalFormat formatador = new DecimalFormat("0.00");

		// Saída:
		System.out.println("TOTAL = R$ " + formatador.format(salarioFinal));

	}

}
