package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		// Cria a Collection Set chamada setNumeros
		Set <Double> setNumeros = new HashSet<Double>();
		
		// Cria um Objeto da Classe Wrapper Double
		Double d = 10.0;
		
		//Adiciona alguns numeros na Colection Set
		setNumeros.add(7.0);
		setNumeros.add(5.0);
		setNumeros.add(3.0);
		setNumeros.add(4.0);
		setNumeros.add(10.0);
		setNumeros.add(d);
		setNumeros.add(null);
		setNumeros.add(4.0);
		
		/** Mostra os dados armazenados na Collection Set
          * Observe que números repetidos foram inseridos apenas uma vez
          * e que o valor nulo (NULL) também foi adicionado
          */
		System.out.println("\nDados da Collection: " + setNumeros);

		// Verifica se um elemento está armazenado na Collection Set
		System.out.println("\nExiste o numero 4.0? " + setNumeros.contains(4.0));
		
		// Remove um elemento da Collection
		setNumeros.remove(4.0);
		System.out.println("\nO numero 4 foi removido!");
		
		// Verifica após a remoção se o elemento ainda existe na Collection Set
		System.out.println("\nExiste o numero 4.0 na Collection? " + setNumeros.contains(4.0));
				
		// Lista os hashcodes da Collection através do Laço de repetição for...each
		System.out.println("\n\nListar todos os Elementos com o Laço For..Each");
		
		for(Double numero : setNumeros) {
			if(numero != null)
				System.out.println("O Hashcode do Elemento " + numero + " é " + numero.hashCode());
		}
		
		// Lista todos os elementos da Collection Set com o Objeto da Classe Iterator
		System.out.println("\n\nListar todos os Elementos com o Iterator");
		
		Iterator<Double> iNotas = setNumeros.iterator();
		
		while(iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
		
		// Verifica se a Collection Set está vazia
		System.out.println("\nA Colection Set está vazia? " + setNumeros.isEmpty());
		
		// Limpa a Collection Set
		setNumeros.clear();
		System.out.println("\nTodos os itens foram removidos da Collection Set!");
		
		// Verifica novamente se a Collection Set está vazia
		System.out.println("\nA Colection Set está vazia? " + setNumeros.isEmpty());
		
	}

}