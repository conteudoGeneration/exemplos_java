package excecao_simples;

public class ExcecaoSimples extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ExcecaoSimples () {}
    
	public ExcecaoSimples (String mensagem) {
		super(mensagem);
	}
}
