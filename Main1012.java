import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1012 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
		input.close();

		// Constante:
		final double PI = 3.14159;

		// Processamentos:
		double areaTriangulo = ((a * c) / 2);
		double areaCirculo = (PI * (c * c));
		double areaTrapezio = (((a + b) * c) / 2);
		double areaQuadrado = (b * b);
		double areaRetangulo = (a * b);

		// Formatador das saídas:
		DecimalFormat formatar = new DecimalFormat("0.000");

		// Saída:
		System.out.println("TRIANGULO: " + formatar.format(areaTriangulo));
		System.out.println("CIRCULO: " + formatar.format(areaCirculo));
		System.out.println("TRAPEZIO: " + formatar.format(areaTrapezio));
		System.out.println("QUADRADO: " + formatar.format(areaQuadrado));
		System.out.println("RETANGULO: " + formatar.format(areaRetangulo));
	}

}
