package estruturaRepeticao;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		int numero, contador;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a Tabuada que você deseja calcular: ");
		numero = leia.nextInt();

		for (contador = 1; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
		}

	}

}
