import java.util.Scanner;

public class Main1021 {
	public static void main(String[] args) {
		//Entrada:
		Scanner input = new Scanner(System.in);
		double valor = input.nextDouble();
		input.close();
		
		//Declaração de variáveis:
		int qtd = 0;
		double resto = 0;
		
		//Processamentos com saídas:
		System.out.println("NOTAS:");
		qtd = (int) (valor / 100);
		resto = valor % 100;
		System.out.println(qtd + " nota(s) de R$ 100.00");
		qtd = (int) (resto / 50);
		resto = resto % 50;
		System.out.println(qtd + " nota(s) de R$ 50.00");
		qtd = (int) (resto / 20);
		resto = resto % 20;
		System.out.println(qtd + " nota(s) de R$ 20.00");
		qtd = (int) (resto / 10);
		resto = resto % 10;
		System.out.println(qtd + " nota(s) de R$ 10.00");
		qtd = (int) (resto / 5);
		resto = resto % 5;
		System.out.println(qtd + " nota(s) de R$ 5.00");
		qtd = (int) (resto / 2);
		resto = resto % 2;
		System.out.println(qtd + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		qtd = (int) (resto / 1);
		resto = (resto % 1) * 100; // Meio que transformando esse cara em um inteiro.
		System.out.println(qtd + " moeda(s) de R$ 1.00");
		qtd = (int) (resto / 50); // 50cent
		resto = resto % 50;
		System.out.println(qtd + " moeda(s) de R$ 0.50");
		qtd = (int) (resto / 25);
		resto = resto % 25;
		System.out.println(qtd + " moeda(s) de R$ 0.25");
		qtd = (int) (resto / 10);
		resto = resto % 10;
		System.out.println(qtd + " moeda(s) de R$ 0.10");
		qtd = (int) (resto / 5);
		resto = resto % 5;
		System.out.println(qtd + " moeda(s) de R$ 0.05");
		qtd = (int) (resto / 1);
		System.out.println(qtd + " moeda(s) de R$ 0.01");

	}
}