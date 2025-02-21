package arvores;

public class NoArvore {
	
	private int elemento; //Armazena os elementos da lista.
	private NoArvore esquerdo; //Armazena o nó com menor elemento.
	private NoArvore direito; //Armazena o nó com maior elemento.
	
	//Método construtor que recebe e armazena um elemento.
	public NoArvore(int elemento) {
		this.elemento=elemento;
		esquerdo=null; //Inicialmente não tem outros nós na arvore.
		direito=null;
	}
	
	
	public int getElemento() {
		return elemento;
	}
	
	public NoArvore getEsquerdo() {
		return esquerdo;
	}
	public void setEsquerdo(NoArvore esquerdo) {
		this.esquerdo=esquerdo;
	}
	
	public NoArvore getDireito() {
		return direito;
	}
	
	public void setDireito(NoArvore direito) {
		this.direito=direito;
	}

}
