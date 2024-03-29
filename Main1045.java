import java.util.Scanner;

public class Main1045 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		input.close();

		// Ordená-los em ordem decrescente:
		double x = 0, y = 0, z = 0; //x é sempre o maior de todos e assim segue ordem...
		double maiorTodos = 0;
		double temp = 0;

		maiorTodos = (a + b + Math.abs(a - b)) / 2; // a
		temp = (b + c + Math.abs(b - c)) / 2; // b
		if (a > b && b > c) {
			for (int i = 0; i < 1; i++) {
				z = c;
				y = b;
				x = a;
			}
		} else if (a > b && c > b) {
			for (int i = 0; i < 1; i++) {
				z = b;
				y = c;
				x = a;
			}
		} else {
			maiorTodos = 0;
			temp = 0;
		}

		maiorTodos = (a + b + Math.abs(a - b)) / 2; // b
		temp = (a + c + Math.abs(a - c)) / 2; // a
		if (b > a && a > c) {
			for (int i = 0; i < 1; i++) {
				z = c;
				y = a;
				x = b;
			}
		} else if (b > c && c > a) {
			for (int i = 0; i < 1; i++) {
				z = a;
				y = c;
				x = b;
			}
		} else {
			maiorTodos = 0;
			temp = 0;
		}

		maiorTodos = (c + b + Math.abs(c - b)) / 2; // c
		temp = (b + a + Math.abs(b - a)) / 2; // b
		if (c > b && b > a) {
			for (int i = 0; i < 1; i++) {
				z = a;
				y = b;
				x = c;
			}
		} else if (c > a && a > b) {
			for (int i = 0; i < 1; i++) {
				z = b;
				y = a;
				x = c;
			}
		} else {
			maiorTodos = 0;
			temp = 0;
		}
		
		//Saídas:
		if(x >= y+z) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		
		if(Math.pow(x, 2) == Math.pow(y, 2) + Math.pow(z, 2)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		
		if(Math.pow(x, 2) > Math.pow(y, 2) + Math.pow(z, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		
		if(Math.pow(x, 2) < Math.pow(y, 2) + Math.pow(z, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if(x == y && y == z) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(x == y || y == z || x == z) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}// main
}