package estruturaRepeticao;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		String nome1, nome2, nome3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º nome: ");
		nome1 = leia.nextLine();
		System.out.println("O 1º nome é: " + nome1);
		
		System.out.println("\nDigite o 2º nome: ");
		nome2 = leia.nextLine();
		System.out.println("O 2º nome é: "  + nome2);
		
		System.out.println("\nDigite o 3º nome: ");
		nome3 = leia.nextLine();
		System.out.println("O 3º nome é: "  + nome3);
	}

}
