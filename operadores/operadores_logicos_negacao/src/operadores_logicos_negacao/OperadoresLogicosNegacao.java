package operadores_logicos_negacao;

public class OperadoresLogicosNegacao {

	public static void main(String[] args) {
        
		int x = 10;
		int y = 5;
		boolean proposicao_01;
		boolean proposicao_02;
		boolean resposta;

		proposicao_01 = x > y;
		System.out.println("\nA proposicao_01 é: " + proposicao_01);
		
		proposicao_02 = x < y;
		System.out.println("\nA proposicao_02 é: " + proposicao_02);

		System.out.println("\n\nNegação\n");

		resposta = !proposicao_01;
		System.out.println("\nA Negação da proposicao_01 é: " + resposta);

		resposta = !proposicao_02;
		System.out.println("\nA Negação da proposicao_02 é: " + resposta);
		
	}
}
