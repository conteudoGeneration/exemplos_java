package vetor_Matriz;

import java.util.Scanner;

public class Exemplo15 {

	public static void main(String[] args) {

		String[][] matrizNomes = new String[2][3];
		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.println("Digite um nome para a posição [" + linha + "][" + coluna + "]: ");
				matrizNomes[linha][coluna] = leia.next();
			}
		}
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("O nome armazenado na posição [" + linha + "][" + coluna + "] é: "
						+ matrizNomes[linha][coluna]);
			}
		}
		
		System.out.println("\nSua Matriz tem " + matrizNomes.length + " linhas e " + matrizNomes[0].length + " colunas.");
		
	}

}
