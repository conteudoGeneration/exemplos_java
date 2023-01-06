package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", "São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		System.out.println("\nExemplo - Método Map");
		
		List<Integer> numerosAoCubo = numeros.stream()
		        .map(x -> x*x*x)
		        .collect(Collectors.toList());
		
		System.out.println("\nNumeros elevados ao Cubo: " + numerosAoCubo);

		
		System.out.println("\nExemplo - Método Filter");
		
		List<Integer> numerosPares = numeros.stream()
		        .filter(x -> x%2==0)
		        .collect(Collectors.toList());

		 System.out.println("\nExibir apenas os Numeros Pares: " + numerosPares);
		 
		 
		 System.out.println("\nExemplo - Método Sorted");
		 
		 List<Integer> numerosOrdenadosAsc = numerosDesordenados.stream()
				 .sorted()
				 .collect(Collectors.toList());

		 System.out.println("\nExibir os Numeros em Ordem Crescente: " + numerosOrdenadosAsc);
		 
		 List<Integer> numerosOrdenadosDesc = numerosDesordenados.stream()
				 .sorted(Comparator.reverseOrder())
				 .collect(Collectors.toList());

		 System.out.println("\nExibir os Numeros em Ordem Decrescente: " + numerosOrdenadosDesc);
		 
		 
		 System.out.println("\nExemplo - Método Distinct");
		 
		 List<String> estadosSemRepeticao = estados.stream()
				 .distinct()
				 .collect(Collectors.toList());
				     
		 System.out.println("\nExibir os Estados sem repetição: " + estadosSemRepeticao);
		 
	}

}
