/*  3 ≤ N ≤ 500 
 * Vi é igual a 1 ou 2, para 1 ≤ i ≤ N
 */

import java.util.Scanner;

public class Main3048 {
	public static void main(String[] args) {
		//Entrada (qtd linhas):
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int[] matrizArmazenagem = new int[n];
		
		if(n >= 3 && n <= 500) {
			int controlador = 0;
			while(controlador<5) {
				Scanner newInput = new Scanner(System.in);
				matrizArmazenagem[n] = newInput.nextInt();
				controlador++;
				newInput.close();
			}
		}
		System.out.println(matrizArmazenagem[n]);
	}
}
