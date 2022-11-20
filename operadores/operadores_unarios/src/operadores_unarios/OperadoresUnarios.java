package operadores_unarios;

public class OperadoresUnarios {

	public static void main(String[] args) {

		int x = 10;
		int y = 8;
		int z = 6;
		int w = 4;
		int i = 40;
		int j = 30;
		int k = 20;
		int l = 10;
		int m = 5;

		System.out.println("\nTransformar em Número negativo: " + (-m));

		System.out.println("\nPré Incrementar: x = ++ y");

		x = ++ y;

		System.out.println("\nValor de X: " + x);
		System.out.println("\nValor de Y: " + y);

		System.out.println("\nPré Decrementar: z = -- w");

		z = -- w;

		System.out.println("\nValor de Z: " + z);
		System.out.println("\nValor de W: " + w);

		System.out.println("\nPós Incrementar: i = j ++");

		i = j ++;
		
		System.out.println("\nValor de I: " + i);
		System.out.println("\nValor de J: " + j);
		
		System.out.println("\nPós Decrementar: k = l --");

		k = l --;

		System.out.println("\nValor de K: " + k);
		System.out.println("\nValor de L: " + l);

	}
}