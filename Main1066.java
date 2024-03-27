import java.util.Scanner;

public class Main1066 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		int[] matriz = new int[5];
		matriz[0] = input.nextInt();
		matriz[1] = input.nextInt();
		matriz[2] = input.nextInt();
		matriz[3] = input.nextInt();
		matriz[4] = input.nextInt();
		input.close();

		// Variavel para registro da contagem:
		int contadorPositivo = 0, contadorNegativo = 0, contadorPar = 0, contadorImpar = 0;

		// Controle de fluxo:
		if (matriz[0] > 0) {
			contadorPositivo++;
		} else if (matriz[0] < 0) {
			contadorNegativo++;
		}
		if (matriz[0] % 2 == 0) {
			contadorPar++;
		} else {
			contadorImpar++;
		}

		if (matriz[1] > 0) {
			contadorPositivo++;
		} else if (matriz[1] < 0) {
			contadorNegativo++;
		}
		if (matriz[1] % 2 == 0) {
			contadorPar++;
		} else {
			contadorImpar++;
		}

		if (matriz[2] > 0) {
			contadorPositivo++;
		} else if (matriz[2] < 0) {
			contadorNegativo++;
		}
		if (matriz[2] % 2 == 0) {
			contadorPar++;
		} else {
			contadorImpar++;
		}

		if (matriz[3] > 0) {
			contadorPositivo++;
		} else if (matriz[3] < 0) {
			contadorNegativo++;
		}
		if (matriz[3] % 2 == 0) {
			contadorPar++;
		} else {
			contadorImpar++;
		}

		if (matriz[4] > 0) {
			contadorPositivo++;
		} else if (matriz[4] < 0) {
			contadorNegativo++;
		}
		if (matriz[4] % 2 == 0) {
			contadorPar++;
		} else {
			contadorImpar++;
		}

		// Saída:
		System.out.println(contadorPar + " valor(es) par(es)");
		System.out.println(contadorImpar + " valor(es) impar(es)");
		System.out.println(contadorPositivo + " valor(es) positivo(s)");
		System.out.println(contadorNegativo + " valor(es) negativo(s)");
	}
}