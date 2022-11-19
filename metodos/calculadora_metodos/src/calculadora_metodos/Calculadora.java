package calculadora_metodos;

import java.util.Scanner;

public class Calculadora {

	private static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args){
				
		int a, b = 0;
		
		System.out.println("Digite o primeiro numero: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = leia.nextInt();
		
		// Executa o Método imprimeOperacao com 2 parâmetros
		// Nome da operação e o Método inteiro que executa a operação
		imprimeOperacao( "Soma", soma(a, b));
		imprimeOperacao( "Subtração", subtracao(a, b));
		imprimeOperacao( "Multiplicação", multiplicacao(a, b));
		imprimeOperacao( "Divisão", divisao(a, b));
         
         // Executa o Método imprimeOperacao com 2 parâmetros
		// Nome da operação e o Método float que executa a operação
		imprimeOperacao( "Soma", soma(100.0f, 50.0f));
		
        // Executa o Método turma()
		turma();
	}
	
	// Método soma com 2 parâmetros inteiros
	public static int soma(int s1, int s2) {
		return s1 + s2;
	}
	
	// Método soma com 2 parâmetros float
	public static float soma(float s1, float s2) {
		return s1 + s2;
	}
	
	// Método subtracao com 2 parâmetros inteiros
	public static int subtracao(int a, int b) {
		return a - b;
	}

	// Método multiplicacao com 2 parâmetros inteiros
	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	// Método divisao com 2 parâmetros inteiros
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	// Método imprimeOperacao do tipo void com 
	// 1 parâmetro String e 1 parâmetro inteiro
	public static void imprimeOperacao(String operacao, int resultado) {
		System.out.println("\nO resultado da " + operacao + " é: " + resultado);
	}
	
	// Método imprimeOperacao do tipo void com 
	// 1 parâmetro String e 1 parâmetro float
	public static void imprimeOperacao(String operacao, float resultado) {
		System.out.println("\nO resultado da " + operacao + " é: " + resultado);
	}

	// Método turma() do tipo void
	public static void turma() {
		System.out.println("\nCalculadora da Turma!!!!");
	}
	
}