package fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++)
			fila.add(i);

		System.out.println("\nElementos na fila: "	+ fila);
		
		System.out.println("\nRemover Elemento: " + fila.remove());

		System.out.println("\nFila atualizada: " + fila);
		
		System.out.println("\nAdicionar Elemento 11: " + fila.add(11));

		System.out.println("\nExibir a Fila atualizada: " + fila);

		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());

		System.out.println("\nExibir o Tamanho da fila: " + fila.size());
		
		System.out.println("\nChecar se o Elemento 4 existe na fila? " + fila.contains(4));
		
		System.out.println("\nExibe e Retira da fila o 1º Elemento (HEAD): " + fila.poll());
		
		System.out.println("\nExibir todos os Elementos da fila por Iteração");
		
		Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()){
		   System.out.println(iterator.next());
		}

		System.out.println("\nLimpar a fila...");
		fila.clear();

		System.out.println("\nA fila está vazia? " + fila.isEmpty());		

	}

}
