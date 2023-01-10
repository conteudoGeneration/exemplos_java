package vetor_Matriz;

import java.util.Scanner;

public class Exemplo13 {

	public static void main(String[] args) {
		int[][] matrizInteiros = new int[3][3];
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("O valor armazenado na posição [" + linha + "][" + coluna + "] é: "
						+ matrizInteiros[linha][coluna]);
			}
		}
	}

}
