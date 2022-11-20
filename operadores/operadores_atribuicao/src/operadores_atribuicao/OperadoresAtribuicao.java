package operadores_atribuicao;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
	
		int x = 4;
		int y = 2;
		int z = 1;

		z = y;
		System.out.println("Atribuição simples (z = y): " + z);

		x += y;
		System.out.println("\nAtribuição com soma (x = x + y): " + x);

		x -= z;
		System.out.println("\nAtribuição com subtração (x = x - z): " + x);

		x *= y;
		System.out.println("\nAtribuição com multiplicação (x = x * y): " + x);

		x /= y;
		System.out.println("\nAtribuição com divisão (x = x / y): " + x);

        x %= y;
        System.out.println("\nAtribuição com o Módulo (x = x % y): " + x);
        
	}
}
