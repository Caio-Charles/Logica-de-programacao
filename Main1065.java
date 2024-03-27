import java.util.Scanner;

public class Main1065 {
	public static void main(String[] args) {
		// Habilitando o Scanner:
		Scanner input = new Scanner(System.in);
		int contagemPares = 0;

		// Laço for:
		for (int a = 0; a < 5; a++) {
			int num = input.nextInt();
			if (num % 2 == 0) { // Todo par tem resto 0 quando dividido por 2.
				contagemPares++;
			}
		}
		input.close();
		System.out.println(contagemPares + " valores pares");

	}

}