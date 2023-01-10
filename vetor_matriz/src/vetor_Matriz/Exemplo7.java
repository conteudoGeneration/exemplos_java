package vetor_Matriz;

public class Exemplo7 {

	public static void main(String[] args) {
		String vetor_cachorros[] = {"Boxer","Pastor Alemão","Pinscher","Husky Siberiano","Corgi"};
		
		System.out.println("Itens dentro do vetor: \n");
		
		for(int indice = 0; indice < vetor_cachorros.length; indice++) {
			System.out.println(vetor_cachorros[indice]);	
		}
		
		System.out.println("\nO tamanho do seu vetor é: " + vetor_cachorros.length);

	}

}
