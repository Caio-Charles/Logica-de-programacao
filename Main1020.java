
// Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
// Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
// Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
import java.util.Scanner;

public class Main1020 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int qtdDias = input.nextInt();
		input.close();

		// Armazenamento:
		int ano = 0;
		int mes = 0;
		int resto = 0; // Nunca haverá acumulação de restos aqui dentro.

		// Processamento:
		ano = (qtdDias / 365); // Quero só a parte inteira... ANO
		resto = (qtdDias % 365); // Quero que guarde o resto da divisão anterior...
		mes = (resto / 30); // Aquele resto eu divido por trinta... MES
		resto = (resto % 30); // Quero só o resto do anterior... O PROPRIO RESTO É A QTD DE DIAS

		// Saída:
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(resto + " dia(s)");

	}

}
