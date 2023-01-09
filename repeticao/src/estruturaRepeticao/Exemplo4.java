package estruturaRepeticao;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		int resultado, numero, contador = 1;
		Scanner leia = new Scanner(System.in);

		while (contador < 4) {
			System.out.println("Digite o " + contador + "º número:");
			numero = leia.nextInt();

			resultado = numero * 3;
			System.out.println(numero + " x 3 = " + resultado);
			System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

			contador++;

		}
		
		System.out.println("\t\t_________Fim do programa_________");

	}

}
