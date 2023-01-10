package estruturaCondicional;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("Parabéns, você foi aprovade!");
		}else {
			System.out.println("Infelizmente você foi reprovade...");
		}
		
	}

}
