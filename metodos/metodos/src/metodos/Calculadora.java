package metodos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float numero1 = 0, numero2 = 0;

		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextFloat();

		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextFloat();

		// Exibe o Resultado de cada Operação Matemática:
		System.out.println("Soma = " + soma(numero1, numero2));
		System.out.println("Subtração = " + subtracao(numero1, numero2));
		System.out.println("Multiplicação = " + multiplicacao(numero1, numero2));
		System.out.println("Divisão = " + divisao(numero1, numero2));

		// Executa o Método void turma()
		turma();

		// Executa o Método float soma() com valores inseridos de forma direta
		System.out.println("\nSoma de valores inseridos de forma direta = " + soma(10.0f, 5.0f));

		// finaliza o Objeto leia
		leia.close();

	}

	// Método soma com 2 parâmetros float
	public static float soma(float numero1, float numero2) {
		return numero1 + numero2;
	}

	// Método subtracao com 2 parâmetros float
	public static float subtracao(float numero1, float numero2) {
		return numero1 - numero2;
	}

	// Método multiplicacao com 2 parâmetros float
	public static float multiplicacao(float numero1, float numero2) {
		return numero1 * numero2;
	}

	// Método divisao com 2 parâmetros float
	public static float divisao(float numero1, float numero2) {
		return numero1 / numero2;
	}

	// Método turma() do tipo void
	public static void turma() {
		System.out.println("\nCalculadora da Turma!!!!");
	}
}
