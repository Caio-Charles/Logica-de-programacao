//NÃO ESTÁ FUNCIONANDO!!!!!!!






/* Leia um valor de ponto flutuante com duas casas decimais. 
 * Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
 * A seguir mostre a relação de notas necessárias.
Entrada:
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída:
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal. */
import java.util.Scanner;

public class Main1021 {
	public static void main(String[] arg) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		double entrada = input.nextDouble();
		input.close();

		// Tentando facilitar o problema...:
		int parteInteira = (int) (entrada);
		double parteDecimal = (int) (entrada - parteInteira); // Isso ainda vai me dar problema...
//		System.out.println(parteInteira);
//		System.out.println(parteDecimal);

		// Criando formas de armazenamento:
		int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, restoNota = 0;
		double cinquentaCentavo = 0, vinteEcincoCentavo = 0, dezCentavo = 0, cincoCentavo = 0, restoMoeda = 0;

		// Primeiro processamento:
		cem = (parteInteira / 100);
		restoNota = (parteInteira % 100);
		cinquenta = restoNota / 50;
		restoNota = restoNota % 50;
		vinte = restoNota / 20;
		restoNota = restoNota % 20;
		dez = restoNota / 10;
		restoNota = restoNota % 10;
		cinco = restoNota / 5;
		restoNota = restoNota % 5;
		dois = restoNota / 2;
		restoNota = restoNota % 2; // Armazenei as moedas de 1 real.

		// Segundo processamento:

		cinquentaCentavo = (int) (parteDecimal / 0.50);
		restoMoeda = (int) (parteDecimal %50);
		vinteEcincoCentavo = (int) (restoMoeda / 0.25);
		restoMoeda = (restoMoeda % 0.25);
		dezCentavo = (int) (restoMoeda / 0.10);
		restoMoeda = (restoMoeda % 0.10);
		cincoCentavo = (int) (restoMoeda / 0.05);
		restoMoeda = (int) (restoMoeda % 0.05);

		System.out.println(cem + " nota(s) de R$ 100.00");
		System.out.println(cinquenta + " nota(s) de R$ 50.00");
		System.out.println(vinte + " nota(s) de R$ 20.00");
		System.out.println(dez + " nota(s) de R$ 10.00");
		System.out.println(cinco + " nota(s) de R$ 5.00");
		System.out.println(dois + " nota(s) de R$ 2.00");
		System.out.println(restoNota + " moeda(s) de R$ 1.00");
		System.out.println(cinquentaCentavo + " moeda(s) de R$ 0.50");
		System.out.println(vinteEcincoCentavo + " moeda(s) de R$ 0.25");
		System.out.println(dezCentavo + " moeda(s) de R$ 0.10");
		System.out.println(cincoCentavo + " moeda(s) de R$ 0.05");
		System.out.println(restoMoeda + " moeda(s) de R$ 0.01");

	}
}
