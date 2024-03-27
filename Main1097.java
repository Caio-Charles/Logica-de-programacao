public class Main1097 {
	public static void main(String[] arg) {
//Variáveis globais:
		int i = 1;
		int[] j = new int[3];
		j[0] = 7; j[1] = 6; j[2] = 5;

//Registrador e controlador:
		int registradorTermo = 0, controladorDoWhile = 0;

//Contador:
		for (int x = 1; x < 10; x += 2) {
			registradorTermo++;
		}

//Repetição controlada:
		do {
			System.out.println("I=" + i + ' ' + "J=" + j[0]);
			System.out.println("I=" + i + ' ' + "J=" + j[1]);
			System.out.println("I=" + i + ' ' + "J=" + j[2]);
			i += 2;
			j[0] += 2; j[1] += 2; j[2] += 2;
			controladorDoWhile++;
		} while (controladorDoWhile < registradorTermo);

	}// Método
}// Classe