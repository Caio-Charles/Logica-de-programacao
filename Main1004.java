// Calcular o consumo médio de combustível de um carro em km/l.
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1004 {
	public static void main(String[] arg) {
		//Inputs: distância em Int e combustível em Double.
		Scanner input = new Scanner(System.in);
		int distance = input.nextInt();
		double consumption = input.nextDouble();
		input.close();
		
		//Processamento:
		double averageConsumption = (distance/consumption);
		
		// Formatando o input 'averageConsumption':
		DecimalFormat toFormatAverageConsumption = new DecimalFormat("0.000");
		
		//Output:
		System.out.println(toFormatAverageConsumption.format(averageConsumption)+" km/l");
		
	}
}