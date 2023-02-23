package metodos;

public class Exemplo01 {

	public static void main(String[] args) {
        int resultado;
        
        resultado = soma(2, 2);
            
        System.out.println("O Resultado da soma é: " + resultado);
    }
    
    public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}

}
