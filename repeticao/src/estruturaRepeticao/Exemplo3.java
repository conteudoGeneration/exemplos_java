package estruturaRepeticao;

public class Exemplo3 {

	public static void main(String[] args) {
		int contador, soma;

		for (contador = 1, soma = 0; contador <= 10; contador++) {
			System.out.println("O valor do contador é: " + contador);

			soma = soma + contador;
		}

		System.out.println("A soma dos 10 primeiros números é: " + soma);

	}

}
