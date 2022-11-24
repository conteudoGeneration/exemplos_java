package controle_remoto;

public class ControleRemoto {

	public static void main(String[] args) {

		Aviao aviao = new Aviao();
		Automovel automovel = new Automovel();
		Barco barco = new Barco();
		
		System.out.println("Sobrescrita de Métodos\n");
		System.out.println("Avião Mover");
		aviao.mover();
		
		System.out.println("\nAutomóvel Mover");
		automovel.mover();
		
		System.out.println("\nBarco Mover");
		barco.mover();
				
	}
	
}
