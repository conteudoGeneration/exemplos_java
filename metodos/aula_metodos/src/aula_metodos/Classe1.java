package aula_metodos;

public class Classe1 {

	public static void metodoPublico1(){
        System.out.println("Método Público - Classe 01");
    }

    static void metodoFriendly1(){
        System.out.println("Método Friendly - Classe 01");
    }

    protected static void metodoProtegido1(){
        System.out.println("Método Protegido - Classe 01");
    }

	@SuppressWarnings("unused")
	private static void metodoPrivado1(){
        System.out.println("Método Privado - Classe 01");
    }
    
}
