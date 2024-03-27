import java.util.Scanner;

public class Main1072 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int contadorIn = 0;
		int contadorOut = 0;

		for (int i = 0; i < n; i++) {
			int temporario = input.nextInt();

			if ((temporario >= 10) && (temporario <= 20)) {
				contadorIn++;
			}

			if ((temporario < 10) || (temporario > 20)) {
				contadorOut++;
			}
		}
		input.close();
		System.out.println(contadorIn + " in");
		System.out.println(contadorOut + " out");
	}
}
