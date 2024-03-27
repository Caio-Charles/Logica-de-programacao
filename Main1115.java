
/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
 * Para cada ponto escrever o quadrante a que ele pertence. 
 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
* Entrada:
* A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.
Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo. */
import java.util.Scanner;

public class Main1115 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble(); // abscissa
		double y = input.nextDouble(); // ordenada
		
		// Controlador da repetição para o caso do ponto está em cima de algum dos
		// eixos.
		int controlador = 0;

		// Repetição de uma instrução que verifica condições para imprimir mensagens na
		// tela:
		do {
			if ((x > 0) && (y > 0)) { // primeiro
				System.out.println("primeiro");
			}

			if ((x < 0) && (y > 0)) { // segundo
				System.out.println("segundo");
			}

			if ((x < 0) && (y < 0)) { // terceiro
				System.out.println("terceiro");
			}

			if ((x > 0) && (y < 0)) { // quarto
				System.out.println("quarto");
			}

			if ((x == 0) || (y == 0)) { // tá em cima de algum dos eixos.
				controlador++;
			}
			x = input.nextDouble();
			y = input.nextDouble();
		} while (controlador < 1);
	}
}

