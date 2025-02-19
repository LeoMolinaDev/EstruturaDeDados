package estruturas;

public class Fila {
	
	private final int tamanho; //Define o tamanho da fila.
	private int inicio; //Variável utilizada para retirar elementos da fila.
	private int fim; //Variável utilizada para definir o último elemento da fila.
	private int quantidade; //Variável utilizada para verificar se a fila está vazia ou cheia.
	private int percorre; //Variável utilizada para percorrer a fila apenas até onde tenha inserido um elemento;
	private int[] fila; //Vetor que armazena os elementos inseridos na fila.
	
	//Construtor que define o tamanho da fila e a define como vazia inicialmente. 
	public Fila(int tamanho) {
		this.tamanho=tamanho;
		fila=new int[tamanho];
		inicio=0;
		fim=-1;
		quantidade=0;
		percorre=0;
	}
	
	//Método para inserir elementos na fila.
	public void insert(int elemento) {
		if(full()==true) {
			System.out.println("Fila cheia...");
		} else {
			fim=(fim+1)%tamanho; //Torna a fila circular e reutiliza espaços de elementos removidos.
			quantidade++;
			percorre++;
			fila[fim]=elemento;
		}
	}
	
	//Método para remover elementos da fila.
	public int remove() {
		if(empty()==true) {
			System.out.println("Fila vazia...");
			return 0;
		} else {
			int removido=inicio;
			inicio=(inicio+1)%tamanho; //Torna a fila circular e reutiliza espaços de elementos removidos.
			quantidade--;
			if(empty()==true) {
				percorre=0;
			}
			return fila[removido];
		}
	}
	
	//Elemento para verificar se a fila está vazia.
	public boolean empty() {
		if(fim==-1) {
			return true;
		} else {
			return false;
		}
	}
	
	//Método para verificar se a fila está cheia.
	public boolean full() {
		if(quantidade==tamanho) {
			return true;
		} else {
			return false;
		}
	}
	
	//Método para imprimir os elementos da fila.
	public void print() {
		for(int i=inicio;i<percorre;i++) {
			System.out.print(fila[i]+"\t");
		}
		System.out.println();
	}
	
}
