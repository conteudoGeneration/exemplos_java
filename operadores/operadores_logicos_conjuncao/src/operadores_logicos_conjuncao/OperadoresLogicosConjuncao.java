package operadores_logicos_conjuncao;

public class OperadoresLogicosConjuncao {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		boolean proposicao_01;
		boolean proposicao_02;
		boolean proposicao_03;
		boolean proposicao_04;
		boolean resposta;

		proposicao_01 = x > y;
		System.out.println("\nA proposicao_01 é: " + proposicao_01);

		proposicao_02 = x < y;
		System.out.println("\nA proposicao_02 é: " + proposicao_02);

		proposicao_03 = x != y;
		System.out.println("\nA proposicao_03 é: " + proposicao_03);

		proposicao_04 = x == y;
		System.out.println("\nA proposicao_04 é: " + proposicao_04);

		System.out.println("\n\nConjunção\n");

		resposta = proposicao_01 && proposicao_03;
		System.out.println("\nA proposicao_01 e proposicao_03 são verdadeiras? " + resposta);

		resposta = proposicao_02 && proposicao_04;
		System.out.println("\nA proposicao_02 e proposicao_04 são verdadeiras? " + resposta);

		resposta = proposicao_01 && proposicao_02;
		System.out.println("\nA proposicao_01 e proposicao_02 são verdadeiras? " + resposta);

		resposta = proposicao_03 && proposicao_04;
		System.out.println("\nA proposicao_03 e proposicao_04 são verdadeiras? " + resposta);

	}

}
