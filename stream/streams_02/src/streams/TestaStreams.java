package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");
		
		System.out.println("\nExemplo - Método Collect");
		
		List <String> estadosR = estados.stream()
		        .filter(x-> x.toString().startsWith("R"))
		        .sorted()
		        .collect(Collectors.toList());

		System.out.println("\nEstados cujo nome começam com a letra R: " + estadosR);
		
		System.out.println("\nExemplo - Método Count");
		
		long numeroEstadosTerminaComO = estados.stream()
		        .filter(x-> x.toString().endsWith("o"))
		        .count();

		System.out.println("\nNúmero de Estados cujo nome terminam com a letra O: " + numeroEstadosTerminaComO);
		
		System.out.println("\nExemplo - Método AllMatch");
		
		boolean todosEstadosContemRio = estados.stream()
				.allMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nTodos os Estados contém a palavra Rio? " + todosEstadosContemRio);
		
		System.out.println("\nExemplo - Método AnyMatch");
		
		boolean algumEstadoContemRio = estados.stream()
				.anyMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nPelo menos um Estado contém a palavra Rio? " + algumEstadoContemRio);
		
		System.out.println("\nExemplo - Método ForEach");
		
		System.out.println("\nEstados cujo nome iniciam com a letra S:");
		
		estados.stream()
		        .filter(x-> x.toString().startsWith("S"))
		        .forEach(System.out::println);
		
	}

}
