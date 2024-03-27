import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1008 {
	public static void main(String[] args) {
		// Inputs:
		Scanner input = new Scanner(System.in);
		int numeroFuncionario = input.nextInt(), horasTrabalhadas = input.nextInt();
		double valorPorHora = input.nextDouble();
		input.close();

		// Formatando a saída:
		DecimalFormat toFormatOutput = new DecimalFormat("0.00");

		// Processamento:
		double salarioFuncionaro = (horasTrabalhadas * valorPorHora);

		// Saídas:
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.println("SALARY = U$ " + toFormatOutput.format(salarioFuncionaro));
	}

}
