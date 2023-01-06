package estruturaRepeticao;

public class Exemplo4 {

	public static void main(String[] args) {
		int contador, soma;

		for (contador = 1, soma = 0; contador <= 10; contador++, soma+= contador) {
			System.out.println("O valor do contador é: " + contador);
		}

		System.out.println("A soma dos 10 primeiros números é: " + soma);

	}

}
