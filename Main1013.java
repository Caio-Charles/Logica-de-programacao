import java.util.Scanner;

public class Main1013 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		input.close();
		
		//Processamento primário:
		int maiorNumero = ((a+b+Math.abs(a-b))/2); // b
		//Controle de fluxo:
			if(c > b) {
				maiorNumero = ((a+c+Math.abs(a-c))/2);
			}else if (c > a) {
				maiorNumero = ((c+b+Math.abs(c-b))/2);
			}
		
		//Saída:
		System.out.println(maiorNumero+" eh o maior");
	}

}
