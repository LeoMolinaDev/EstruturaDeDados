package estruturas;

public class Fila {
	
	private final int tamanho; //Define o tamanho da fila.
	private int inicio; //Variável utilizada para retirar elementos da fila
	private int fim;
	private int quantidade;
	private int percorre;
	private int[] fila;
	
	public Fila(int tamanho) {
		this.tamanho=tamanho;
		fila=new int[tamanho];
		inicio=0;
		fim=-1;
		quantidade=0;
		percorre=0;
	}
	
	public void insert(int elemento) {
		if(full()==true) {
			System.out.println("Fila cheia...");
		} else {
			fim=(fim+1)%tamanho;
			quantidade++;
			percorre++;
			fila[fim]=elemento;
		}
	}
	
	public int remove() {
		if(empty()==true) {
			System.out.println("Fila vazia...");
			return 0;
		} else {
			int removido=inicio;
			inicio=(inicio+1)%tamanho;
			quantidade--;
			return fila[removido];
		}
	}
	
	public boolean empty() {
		if(fim==-1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean full() {
		if(quantidade==tamanho) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		for(int i=inicio;i<percorre;i++) {
			System.out.print(fila[i]+"\t");
		}
		System.out.println();
	}
	
}
