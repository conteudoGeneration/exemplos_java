package exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		boolean loop = true;
		
		do {
		
			try {
			
				System.out.println("\nDigite uma idade: ");
				idade = leia.nextInt();
					
				validarIdade(idade);
				
				loop = false;
				
			}catch(ArithmeticException e){
				System.out.println("\nDigite um número inteiro maior ou igual a 18!");
			}
			
		}while (loop);
		
	}

	public static void validarIdade(int idade){
		
		if(idade < 18)
			throw new ArithmeticException("A Pessoa não pode dirigir!!");
		else
			System.out.println("A Pessoa pode dirigir!!");
	
	}

}