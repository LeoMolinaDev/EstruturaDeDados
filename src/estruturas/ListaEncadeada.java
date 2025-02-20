package estruturas;

import estruturas.No; //A lista utiliza o No para armazenar o elemento e o próximo No da lista.

public class ListaEncadeada {
	
	private No primeiro; //Utilizado para definir o começo da lista e por onde deve ser percorrida.
	private No ultimo; //Utilizado para verificar que não existem nós depois deste.
	private No aux; //Utilizado para percorrer a lista.
	private int contador; //Utilizado para inciar o No ultimo.
	
	//Método construtor que define a lista inicialmente como vazia.
	public ListaEncadeada() {
		primeiro=null;
		ultimo=null;
		contador=0;
	}
	
	//Método utilizado para inserir novos elementos na lista.
	public void insert(int elemento) {
		No novo=new No(elemento,primeiro);
		primeiro=novo;
		if(contador==0) {
			ultimo=primeiro;
		}
		contador++;
	}
	
	//Método para remover um elemento determinado da lista.
	public int remove(int remover) {
		aux=primeiro;
		contador--;
		if(empty()==true) { //Caso a lista esteja vazia.
			System.out.println("Lista vazia");
			contador++;
			return remover;
		} else if(primeiro.getElemento()==remover) { //Verifica se o elemento a ser removido é o primeiro da lista.
			if(primeiro==ultimo) { //Verifica se o elemento é o único da lista.
				primeiro=null;
				System.out.println("Elemento removido...");
				return remover;
			} else {
				primeiro=primeiro.getProximo();
				System.out.println("Elemento removido...");
				return remover;
			}
		}
		while(true) {
			if(aux==ultimo) { //Verifica se percorreu toda a lista.
				contador++;
				System.out.println("Elemento não encontrado...");
				return remover;
			}
			if(aux.getProximo().getElemento()==remover && aux.getProximo()!=ultimo) { //Verifica se o próximo elemento da lista será removido e se não é o último.
				aux.setProximo(aux.getProximo().getProximo());
				System.out.println("Elemento removido...");
				return remover;
			} else if(aux.getProximo().getElemento()==remover && aux.getProximo()==ultimo) { //Verifica se o próximo elemento da lista será removido e se é o último.
				ultimo=aux; //Define um novo nó como úlitmo. 
				aux.setProximo(null); //Descarta o elemento escolhido.
				System.out.println("Elemento removido...");
				return remover;
			}
			aux=aux.getProximo(); //Percorre a lista.
		}
	}
	
	//Método para verificar se a lista está vazia.
	public boolean empty() {
		if(primeiro==null) {
			return true;
		} else {
			return false;
		}
	}
	
	//Método para imprimir os elementos da lista.
	public void print() {
		if(empty()==true) {
			System.out.println("Lista vazia...");
		}
		aux=primeiro;
		while(aux!=null) {
			System.out.print(aux.getElemento()+"\t");
			aux=aux.getProximo();
		}
		System.out.println();
	}
	
}
