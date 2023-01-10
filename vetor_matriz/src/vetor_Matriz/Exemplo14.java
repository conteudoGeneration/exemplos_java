package vetor_Matriz;

import java.util.Scanner;

public class Exemplo14 {

	public static void main(String[] args) {

		int soma = 0;
		int vetorSoma[] = new int[4]; // Cria um vetor de 4 posições
		int[][] matrizInteiros = new int[5][4]; // Cria uma Matriz 5x4
		
		Scanner leia = new Scanner(System.in);

		// Insere os dados na matriz
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {

				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
		}
		
		// Como desejamos somar as colunas, invertemos os índices nos laços de repetição
		// Compare com os laços de repetição acima
		
		for(int coluna = 0; coluna < 4; coluna++) {
			for(int linha = 0; linha < 5; linha++) {
				
				// Armazena a soma dos elementos da coluna na variável 
				soma += matrizInteiros[linha][coluna];
			}
			
			// Guarda a soma no vetor auxiliar
			vetorSoma[coluna] = soma;
			
			// Zera a variável soma, para receber a soma dos elementos da próxima coluna
			soma = 0;
		}
		
		// Mostra na tela o resultado da soma dos elementos de cada coluna da Matriz
		for(int coluna=0; coluna < 4; coluna++) {
			System.out.println("Soma de todos os elementos da coluna " + (coluna + 1) + " é: " + vetorSoma[coluna]);
		}	
	}
}
