import java.util.Scanner;

public class Main1043 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		input.close();

		// Processamento:
		if (a + b > c && a + c > b && b + c > a) { // É um triângulo.
			double perimetro = a + b + c;
			System.out.println("Perimetro = " + perimetro);
		} else {// Não é, calcular área:
			double area = ((a + b) * c) / 2;
			System.out.println("Area = " + area);
		}

	}

}
