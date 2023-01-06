package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();

		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(9);

		/**
		 * Adiciona algumas Notas. 
		 * Observe que a primeira nota é o Objeto Wrapper Double.
		 */
		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);

		/**
		 * Mostra na tela todas as notas através do laço For...Each. 
		 */
		System.out.println("\nNotas cadastradas - Laço For...Each");

		for(Double nota : notas) {
			System.out.println(nota);
		}
		
		/**
		 * Mostra na tela todas as notas através da Interface Iterator. 
		 */
		System.out.println("\nNotas cadastradas - Interface Iterator");

		Iterator<Double> iNotas = notas.iterator();
		
		while(iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
	
		
	}

}