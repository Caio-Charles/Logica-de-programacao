import java.util.Scanner;

public class Main1114 {
	public static void main(String[] args) {
		// Variáveis:
		int senhaCorreta = 2002;
		int controladorPassagem = 0;

		// Primeiro input:
		Scanner input = new Scanner(System.in); // Nesse caso, não fechamos o scanner para não dá erro no beecrowd.
		int tentativa = input.nextInt();

		// Repete uma sequência de controles de fluxo a cada verificação do input.
		do {
			if (tentativa == senhaCorreta) { // Encerra quando acerta a senha fazendo um incrimento na variável de
												// controle.
				System.out.println("Acesso Permitido");
				controladorPassagem++;
			} else {
				System.out.println("Senha Invalida");
				tentativa = input.nextInt();
			}
		} while (controladorPassagem < 1); // Permite várias tentativas, porém quando acertar a senha encerra.
	}
}
