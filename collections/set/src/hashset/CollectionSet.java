package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		// Cria a Collection Set, do tipo String chamada setFrutas
		Set<String> setFrutas = new HashSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		/**
		 * Mostra os dados armazenados na Collection Set Observe que as frutas repetidas
		 * foram inseridos apenas uma vez
		 */
		System.out.println("\nDados da Collection: " + setFrutas);

		// Verifica se um elemento está armazenado na Collection Set
		System.out.println("\nExiste a fruta Kiwi? " + setFrutas.contains("Kiwi"));

		// Remove um elemento da Collection
		setFrutas.remove("Kiwi");
		System.out.println("\nKiwi foi removida!");

		// Verifica após a remoção se o elemento ainda existe na Collection Set
		System.out.println("\nExiste a fruta Kiwi na Collection? " + setFrutas.contains("Kiwi"));

		// Lista os hashcodes da Collection através do Laço de repetição for...each
		System.out.println("\n\nListar todos os Elementos com o Laço For..Each");

		for (String fruta : setFrutas) {
			if (fruta != null)
				System.out.println("O Hashcode do Elemento " + fruta + " é " + fruta.hashCode());
		}

		// Lista todos os elementos da Collection Set com o Objeto da Classe Iterator
		System.out.println("\n\nListar todos os Elementos com o Iterator");

		Iterator<String> isetFrutas = setFrutas.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
		}

		// Verifica se a Collection Set está vazia
		System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());

		// Limpa a Collection Set
		setFrutas.clear();
		System.out.println("\nTodos os itens foram removidos da Collection Set!");

		// Verifica novamente se a Collection Set está vazia
		System.out.println("\nA Colection Set está vazia? " + setFrutas.isEmpty());
		
	}

}
