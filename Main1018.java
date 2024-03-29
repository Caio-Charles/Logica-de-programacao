import java.util.Scanner;

public class Main1018 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int valor = input.nextInt();

		int qtd = 0, resto = 0;

		// Sucessivas repetições:
		qtd = valor / 100;
		resto = valor % 100;
		System.out.println(qtd + " nota(s) de R$ " + "100,00");
		qtd = resto / 50;
		resto = resto % 50;
		System.out.println(qtd + " nota(s) de R$ " + "50,00");
		qtd = resto / 20;
		resto = resto % 20;
		System.out.println(qtd + " nota(s) de R$ " + "20,00");
		qtd = resto / 10;
		resto = resto % 10;
		System.out.println(qtd + " nota(s) de R$ " + "10,00");
		qtd = resto / 5;
		resto = resto % 5;
		System.out.println(qtd + " nota(s) de R$ " + "5,00");
		qtd = resto / 2;
		resto = resto % 2;
		System.out.println(qtd + " nota(s) de R$ " + "2,00");
		qtd = resto;
		System.out.println(qtd + " nota(s) de R$ " + "1,00");
		
		input.close();

	}

}
