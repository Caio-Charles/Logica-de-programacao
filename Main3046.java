// ((N+1)*(N+2))/2
import java.util.Scanner;

public class Main3046 {
	public static void main(String[] args) {
		//Entrada:
		Scanner input = new Scanner(System.in);
		int tipoJogo = input.nextInt();
		input.close();
		
		//Processamento:
		int numPecas = ((tipoJogo+1)*(tipoJogo+2))/2;
		
		//Saída:
		if(tipoJogo >= 0 && tipoJogo <= 10000) {
			System.out.println(numPecas);
		}
	}

}
