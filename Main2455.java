import java.util.Scanner;

public class Main2455 {
	public static void main(String[] args) {
		// Entradas:
		Scanner input = new Scanner(System.in);
		int p1 = input.nextInt(), c1 = input.nextInt(), p2 = input.nextInt(), c2 = input.nextInt();
		input.close();
		
		//Armazenamento:
		int esquerda = (p1*c1);
		int direita = (p2*c2);
		
		if(esquerda == direita) {//Equilibrio
			System.out.println("0");
		}
		if (esquerda > direita) {//Desequilibrio com criança esquerda embaixo.
			System.out.println("-1");
		}else if (esquerda < direita) {//Desequilibrio com criança esquerda em cima.
			System.out.println("1");
		}
	}

}
