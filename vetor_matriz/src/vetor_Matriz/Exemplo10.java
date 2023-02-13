package aula_04;

import java.util.Arrays;

public class Exemplo10 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = {1,2,3,4,5,10,7,6,9,8};
		
		//Ordena o Vetor 
		Arrays.sort(vetorInteiros);
		
		System.out.println("\nVetor Ordenado");
		
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			 System.out.println(vetorInteiros[indice]);
		}

        System.out.println("\nO elemento 10 Existe? Qual é a posição?");

        int posicao = Arrays.binarySearch(vetorInteiros, 10);
        
        // Se a posição for positiva = Encontrou
        if (posicao >= 0 )
			System.out.println("\nO elemento foi Encontrado e está na Posição: " + posicao);
		else
			System.out.println("\nElemento não encontrado!");

	}

}
