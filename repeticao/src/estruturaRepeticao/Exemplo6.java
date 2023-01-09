package estruturaRepeticao;

import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {

		int numero, resultado, contador = 3;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();

			resultado = numero * 5;

			System.out.println("\nO resultado da multiplicação é: " + resultado);

		} while (contador <= 2);
	}
}
