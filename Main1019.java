import java.util.Scanner;
public class Main1019 {
	public static void main(String[] args) {
		// Entrada (s):
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		input.close();
		
		//Criando uma matriz 1x3:
		int[] matriz = new int[3];
		
		//Processamento
		matriz[0] = (numero/3600); // horas
		matriz[1] = ((numero%3600)/60); // minutos
		matriz[2] = (numero%3600)%60; // segundos
		
		//Saída:
		System.out.println(matriz[0]+":"+matriz[1]+":"+matriz[2]);
	}
}