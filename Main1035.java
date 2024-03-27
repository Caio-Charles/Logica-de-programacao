import java.util.Scanner;

public class Main1035 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
		input.close();
		
		//Controle de fluxo
		if ((b > c) && (d > a)) {
			if ((c + d) > (a + b)) {
				if ((c > 0) && (d > 0)) {
					if ((a != 0) && (a % 2 == 0)) { // 0 não é par.
						System.out.println("Valores aceitos");
					}
				}
			}
		} else { // Só de negar a primeira condição, a sequência seguinte já não pode ser
					// prosseguida pois (b > c) && (d > a) é SINE QUA NON.
			System.out.println("Valores nao aceitos");
		} // If
	}// Metodo
}// Classe