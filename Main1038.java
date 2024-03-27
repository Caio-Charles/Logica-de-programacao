import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1038 {
	public static void main(String[] args) {
		// 5x2, onde 1ªcol = código; 2ªcol=preço.
		double[][] matriz = new double[5][2];
		matriz[0][0] = 1; matriz[0][1] = 4.00; //Cachorro quente
		matriz[1][0] = 2; matriz[1][1] = 4.50; //X-Salada
		matriz[2][0] = 3; matriz[2][1] = 5.00; //X-Bacon
		matriz[3][0] = 4; matriz[3][1] = 2.00; //Torrada simples
		matriz[4][0] = 5; matriz[4][1] = 1.50; //Refrigerante
		
		//Entradas:
		Scanner input = new Scanner(System.in);
		double codigoProduto = input.nextDouble();
		double qtdProduto = input.nextDouble();
		input.close();
		
		//Preço final:
		double precoFinal = 0;
		
		//Controle de fluxo:
		if (codigoProduto == matriz[0][0]) {
			precoFinal=(qtdProduto*matriz[0][1]); // Para código 1
		}
		
		if (codigoProduto == matriz[1][0]) {
			precoFinal=(qtdProduto*matriz[1][1]); // Para código 2
		}
		
		if (codigoProduto == matriz[2][0]) {
			precoFinal=(qtdProduto*matriz[2][1]); // Para código 3
		}
		
		if (codigoProduto == matriz[3][0]) {
			precoFinal=(qtdProduto*matriz[3][1]); // // Para código 4
		}
		
		if (codigoProduto == matriz[4][0]) {
			precoFinal=(qtdProduto*matriz[4][1]); // // Para código 4
		}
		
		//Formatar a saída:
		DecimalFormat toFormatOutput = new DecimalFormat("0.00");
		
		//Saída:
		System.out.println("Total: R$ "+toFormatOutput.format(precoFinal));
	}
}