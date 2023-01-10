package estruturaCondicional;

import java.util.Scanner;

public class Exemplo7 {

	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

		System.out.println("\n--Digite 1 para ver indicação de um livro--");
		System.out.println("--Digite 2 para ver ler uma frase motivacional--");
		System.out.println("--Digite 3 para receber uma indicação de música--");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Livro: O Alquimista");
			break;
		case 2:
			System.out.println("Frase motivacional: Se você cair, levante! Não dá para andar deitado.");
			break;
		case 3:
			System.out.println("Música: AURORA - No Cure For Me.");
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
}
