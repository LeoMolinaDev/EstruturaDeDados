package estruturas;

public class PilhaSimples {
	
	private final int tamanho; //Define o tamanho da pilha.
	private int topo; //Variável que ajuda ainserir ou retirar elementos.
	private int[] pilha; //Vetor para armazenar os elementos da pilha.
	
	//Método construtor que define o tamanho da lista e a inicia como vazia (topo=-1).
	public PilhaSimples(int tamanho) {
		this.tamanho=tamanho;
		pilha=new int[tamanho];
		topo=-1;
	}
	
	//Método para inserir um elemento na pilha.
	public void push(int elemento) {
		if(full()==true) {
			System.out.println("Pilha cheia...");
		} else {
			topo++;
			pilha[topo]=elemento;
		}
	}
	
	//Método para retirar o último elemento inserido da pilha.
	public void pop() {
		if(empty()==true) {
			System.out.println("Pilha vazia...");
		} else {
			topo--;
		}
	}
	
	//Método para verificar se a pilha está vazia.
	public boolean empty() {
		if(topo==-1) {
			return true;
		} else {
			return false;
		}
	}
	
	//Método para verificar se a pilha está cheia.
	public boolean full() {
		if(topo==(tamanho-1)) {
			return true;
		} else {
			return false;
		}
	}
	
	//Método para exibir os elemento da pilha.
	public void print() {
		for(int i=0;i<=topo;i++) {
			System.out.print(pilha[i]+"\t");
		}
		System.out.println();
	}
	
}