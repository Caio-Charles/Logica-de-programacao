public class GeradorFrase {
	public static void main(String[] args) {
		// Meramente ilustrativo e limitado:
		
		String[] artigos = { "O", "A", "Um", "Uma" };
		String[] substantivos = { "casa", "chápeu", "tabuada", "maçã", "bicicleta", "sapato", "menina", "menino",
				"homem", "mulher", "danone", "sorvete", "árvore", "garrafa", "chiclete", "desodorante", "sacola",
				"livro", "árvore", "refrigerante", "lista", "guardanapo" };
		String[] adjetivos = { "bonito", "legal", "grande", "pequeno", "gordo", "magro", "divertido", "surpreendente",
				"interessante", "frio", "quente", "limpo", "sujo" };
		String[] verbos = { "é", "foi", "está", "correu", "vai", "vem", "quer" };

		int a = artigos.length;
		int b = substantivos.length;
		int c = adjetivos.length;
		int d = verbos.length;

		int randomUm = (int) (Math.random() * a);
		int randomDois = (int) (Math.random() * b);
		int randomTres = (int) (Math.random() * c);
		int randomQuatro = (int) (Math.random() * d);

		String frase = artigos[randomUm] + ' ' + substantivos[randomDois] + ' ' + verbos[randomQuatro] + ' '
				+ adjetivos[randomTres] + '.';
		System.out.println(frase);
	}
}