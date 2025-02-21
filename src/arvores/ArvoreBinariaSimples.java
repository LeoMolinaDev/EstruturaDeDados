package arvores;

import arvores.NoArvore;

public class ArvoreBinariaSimples {
	
	private NoArvore raiz; //Primeiro nó inserido, a árvore é percorrida a partir dele.
	private NoArvore aux; //Utilizado para percorrer a árvore.
	
	//Método construtor que inicia a árvore inicialmente como vazia.
	public ArvoreBinariaSimples() {
		raiz=null;
		aux=null;
	}
	
	//Método necessário para iniciar o método printEmOrdem.
	public NoArvore getRaiz() {
		return raiz;
	}
	
	//Método que insere elementos na árvore.
	public void insert(int elemento) {
		NoArvore novo=new NoArvore(elemento);
		if(raiz==null) { //Caso a árvore esteja vazia, inicia o primeiro nó como a raiz.
			raiz=novo;
		}
		aux=raiz;
		while(true) {
			if(elemento==aux.getElemento()) {
				return;
			} else if(elemento<aux.getElemento()) {
				if(aux.getEsquerdo()==null) {
					aux.setEsquerdo(novo);
				} else {
					aux=aux.getEsquerdo();
				}
			} else {
				if(aux.getDireito()==null) {
					aux.setDireito(novo);
				} else {
					aux=aux.getDireito();
				}
			}
		}
	}
	
	public int encontrarElemento(int elemento) {
		aux=raiz;
		while(true) {
			if(aux==null) {
				System.out.println("Elemento não encontrado...");
				return 0;
			}
			if(elemento==aux.getElemento()) {
				return elemento;
			} else if(elemento<aux.getElemento()) {
				aux=aux.getEsquerdo();
			} else {
				aux=aux.getDireito();
			}
		}
	}
	
	//Método que mostra os elementos inseridos em ordem crescente.
	public void printEmOrdem(NoArvore atual) {
		if(atual!=null) {
		printEmOrdem(atual.getEsquerdo());
		System.out.print(atual.getElemento()+"\t");
		printEmOrdem(atual.getDireito());
		}
	}

}
