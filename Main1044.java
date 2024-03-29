import java.util.Scanner;

public class Main1044 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(), b = input.nextInt();
		input.close();

		// Processamento:
		if (b % a == 0 || a % b == 0) { // São múltiplos.
			System.out.println("Sao Multiplos");
		} else {// Não são múltiplos
			System.out.println("Nao sao Multiplos");
		}

	}

}
