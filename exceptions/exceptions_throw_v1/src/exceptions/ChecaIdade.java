package exceptions;

import java.util.Scanner;

public class ChecaIdade {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);
		
	}

public static void validarIdade(int idade){
		
		if(idade < 18)
			throw new ArithmeticException("A Pessoa não pode dirigir!!");
		else
			System.out.println("A Pessoa pode dirigir!!");
	
	}

}