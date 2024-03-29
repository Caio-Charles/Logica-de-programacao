import java.util.Scanner;

public class Main1091 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtdTestes = input.nextInt();
		int divX = input.nextInt(), divY = input.nextInt();
		int x = 0, y = 0;

		for (int i = 0; i < qtdTestes; i++) {
			x = input.nextInt();
			y = input.nextInt();
			if ((x >= divX || x <= divX) && (y == divY)) { // Em cima do eixo X.
				System.out.println("divisa");
			}
			if (((y >= divY || y <= divY) && (x == divX))) { // Em cima do eixo Y.
				System.out.println("divisa");
			}

			if (x > divX && y > divY) {// Nordeste
				System.out.println("NE");
			}
			if (x < divX && y > divY) {// Noroeste
				System.out.println("NO");
			}
			if (x < divX && y < divY) {// Sudoeste
				System.out.println("SO");
			}
			if (x > divX && y < divY) {// Sudeste
				System.out.println("SE");
			}

		}

		input.close();

	}

}
