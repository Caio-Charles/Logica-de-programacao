import java.util.Scanner;
public class Main1016 {
	public static void main(String[] args) {
		int[][] matriz = new int[2][2];
		// 1ª coluna: distância ; 2ª coluna: tempo:
		matriz[0][0] = 1; // km.
		matriz[0][1] = 2; // minutos.
		
		//Criando o input:
		Scanner input = new Scanner(System.in);
		matriz[1][0] = input.nextInt(); // Atribuindo o valor na 2ª linha, 1ª coluna.
		input.close();
		
		// Processamento:
		matriz[1][1] = ((matriz[1][0]*matriz[0][1])/matriz[0][0]); // Regra de três.
		
		//Output:
		System.out.println(matriz[1][1]+" minutos");
	}
}