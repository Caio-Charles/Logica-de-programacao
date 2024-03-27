import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1017 {
	public static void main(String[] args) {
		// Criando uma tabela 2x2, onde: 1ªcoluna: distância em km, 2ªcoluna: consumo em litros.
		double[][] matriz = new double[2][2];

		// Alguns valores já são fixos:
		matriz[0][0] = 12; // km.
		matriz[0][1] = 1; // litros.

		// Inputs: tempo da viagem(h) e a velocidade média(km/h)
		Scanner input = new Scanner(System.in);
		double tempoViagem = input.nextDouble();
		double velocidadeMedia = input.nextDouble();
		input.close();
		
		//Primeiro processamento (distância percorrida):
		double distanciaPercorrida = (velocidadeMedia*tempoViagem); // km.
		matriz[1][0] = distanciaPercorrida;
		
		//Segundo processamento (consumo):
		matriz[1][1] = ((matriz[1][0]*matriz[0][1])/matriz[0][0]); // Litros.
		
		//Formatando o output:
		DecimalFormat toFormatOutput = new DecimalFormat("0.000");
		
		//Output:
		System.out.println(toFormatOutput.format(matriz[1][1]));
	}
}
