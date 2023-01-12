package exibir_variaveis;

public class ExibirVariaveis {

	public static void main(String[] args) {
		
		int quantidade = 1000;
		long identificador = 10000l;
		float altura = 25.4f; 
		double area = 45.4567;
		double tamanho = 650000000.00;
		char tipo = 'A';
		String palavra = "Generation";
		 
		System.out.printf("Variável quantidade = %d", quantidade);
		System.out.printf("Variável identificador = %3d", identificador);
		System.out.printf("Variável altura = %8.2f", altura);
		System.out.printf("Variável area = %6.2f", area);
		System.out.printf("Variável tamanho = %e", tamanho);
		System.out.printf("Variável tamanho = %E", tamanho);
		System.out.printf("Variável tipo = %c", tipo);
		System.out.printf("Variável palavra = %s", palavra);

	}

}
