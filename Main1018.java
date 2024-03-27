import java.util.Scanner;

public class Main1018 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int valorMonetario = input.nextInt();

		// Armazenar a quantidade necessária de cada nota:
		int cem = 0;
		int cinquenta = 0;
		int vinte = 0;
		int dez = 0;
		int cinco = 0;
		int dois = 0;
		int um = 0;

		// Processamento:
		if ((valorMonetario > 0) && (valorMonetario < 1000000)) {
			for (int i = 0; i < 1; i++) { // Ele vai repetir 1x cada instrução abaixo.
				cem = valorMonetario / 100;
				cinquenta = ((valorMonetario % 100) / 50);
				vinte = (((valorMonetario % 100) % 50) / 20);
				dez = ((((valorMonetario % 100) % 50) % 20) / 10);
				cinco = (((((valorMonetario % 100) % 50) % 20) % 10) / 5);
				dois = ((((((valorMonetario % 100) % 50) % 20) % 10) % 5) / 2);
				um = ((((((valorMonetario % 100) % 50) % 20) % 10) % 5) % 2);
			}
		}

		if ((valorMonetario == 0) || (valorMonetario == 1000000)) {
			valorMonetario = input.nextInt();
		}

		// Saídas:
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");
		input.close();
	}

}