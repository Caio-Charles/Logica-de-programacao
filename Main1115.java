import java.util.Scanner;

public class Main1115 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0;

		while ((x = input.nextInt()) != 0 && (y = input.nextInt()) != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
		}
	}
}