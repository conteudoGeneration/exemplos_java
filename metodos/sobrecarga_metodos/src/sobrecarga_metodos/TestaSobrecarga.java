package sobrecarga_metodos;

import java.util.Scanner;

public class TestaSobrecarga {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String mensagem;
		
		System.out.println("Sobrecarga de Métodos\n");
		
		System.out.println("\nDigite uma mensagem: ");
		mensagem = leia.nextLine();
		
		exibirMensagem();
		exibirMensagem(mensagem);
		

	}
	
	// Método exibirMensagem() sem parâmetros
	public static void exibirMensagem() {
		System.out.println("\nMensagem do Método 01!");
	}

	// Método exibirMensagem() com parâmetro
	public static void exibirMensagem(String mensagem) {
		System.out.println("\nMensagem digitada pelo usuário: " + mensagem);
	}

}
