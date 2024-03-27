import java.util.Scanner;

public class Main1070 {
	public static void main(String[] arg) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();

		// Verifica se 'number' é par:
		if (number % 2 == 0) {
			int a = number + 1;
			int b = number + 3;
			int c = number + 5;
			int d = number + 7;
			int e = number + 9;
			int f = number + 11;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
		}

		// Verifica se 'number' é ímpar:
		if (number % 2 != 0) {
			for (int i = 0; i < 6; i++) {
				System.out.println(number);
				number += 2;
			}
		}
	}
}