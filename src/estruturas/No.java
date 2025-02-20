package estruturas;

public class No {
	
	private int elemento; //Armazena os elementos da lista.
	private No proximo; //Guarda o prócximo nó.
	
	public No(int elemento,No proximo) {
		this.elemento=elemento;
		this.proximo=proximo;
	}
	
	public int getElemento() {
		return elemento;
	}
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo=proximo;
	}

}
