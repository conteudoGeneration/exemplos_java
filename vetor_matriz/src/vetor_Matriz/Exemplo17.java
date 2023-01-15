package vetor_Matriz;

public class Exemplo17 {

	public static void main(String[] args) {
		
		String alunes[][] = { {"Felipe", "Jonas", "Julia"}, {"Mariana", "Carlos", "Juliana"}, {"Augusto", "Sabrina", "Julius"} };

		for (String[] linha : alunes) {
			for (String alune : linha) {
				System.out.println(alune);
			}
		}
		
	}
}
