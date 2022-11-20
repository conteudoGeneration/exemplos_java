package operadores_aritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int z = 3;
		int w = -5;
		
		System.out.println("Soma (4+2): " + (x + y));
		System.out.println("\nSoma com numero negativo (4 + (-5)): " + (x + w));
		System.out.println("\nSubtração (4-2): " + (x - y));
		System.out.println("\nMultiplicação (4*2): " + (x * y));
		System.out.println("\nDivisão (4/2): " + (x / y));
		System.out.println("\nMódulo (resto da divisão): " + (x % 2));
		System.out.println("\nMódulo (resto da divisão): " + (z % 2));
	}
}