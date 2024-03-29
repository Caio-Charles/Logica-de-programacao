
public class ControleFor {

	public static void main(String[] args) {
		// É como se fosse um "if", onde o incremento seria feito como última instrução.
		// Porém, o 'for' é um laço de repetição.
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// Exemplo:
		int i = 0;
		if (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		
		teste : for(int j = 0; true; j++) {
			System.out.println(j);
			if(j == 10) {
				break teste;
			}
		}

	}

}
