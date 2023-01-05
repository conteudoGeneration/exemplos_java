package lambda_collections_02;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Exibir os itens\n");
		
		// Exibir os itens da Lista com Expressão Lambda
		numeros.forEach(n -> System.out.println(n));

		System.out.println("\nExibir os itens somados com eles mesmos\n");
		
		// Exibir os itens da Lista dobrados com Expressão Lambda
		numeros.forEach(n -> System.out.println(n + n));

		System.out.println("\nExibir os itens pares da lista\n");
		
		// Exibir apenas os elementos pares da Lista com Expressão Lambda
		numeros.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}
}