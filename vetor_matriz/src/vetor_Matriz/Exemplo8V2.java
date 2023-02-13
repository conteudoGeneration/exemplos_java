package aula_04;

import java.util.Arrays;

public class Exemplo8V2 {

	public static void main(String[] args) {

		int vetorInteiros[] = { 3, 2, 1, 6, 5, 10, 7, 4, 9, 8 };

		Arrays.sort(vetorInteiros);

		System.out.println("Array de primitivos em Ordem Crescente \n");
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(vetorInteiros[indice]);
		}

		System.out.println("\nArray de primitivos em Ordem Decrescente \n");
		
		int[] reverseArray = new int[vetorInteiros.length];

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			reverseArray[indice] = vetorInteiros[(vetorInteiros.length - 1) - indice];
		}

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println(reverseArray[indice]);
		}

	}

}
