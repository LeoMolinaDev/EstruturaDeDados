package testes;

import estruturas.*;

public class Testes {
	public static void main(String[] args) {
		
		PilhaSimples pilha1=new PilhaSimples(5);
		Fila fila1=new Fila(5);
		
		//Teste Pilha Simples
		System.out.println("================Pilha Simples================");
		System.out.println("A pilha está vazia? "+pilha1.empty());
		pilha1.pop();
		pilha1.push(1);
		pilha1.push(2);
		pilha1.push(3);
		pilha1.push(4);
		pilha1.push(5);
		System.out.println("A pilha está cheia? "+pilha1.full());
		pilha1.push(6);
		pilha1.print();
		pilha1.pop();
		pilha1.print();
		
		//Teste Fila
		System.out.println("================Pilha Simples================");
		System.out.println("A fila está vazia? "+fila1.empty());
		fila1.remove();
		fila1.insert(1);
		fila1.insert(2);
		fila1.insert(3);
		fila1.insert(4);
		fila1.insert(5);
		System.out.println("A fila está cheia? "+fila1.full());
		fila1.insert(6);
		fila1.print();
		fila1.remove();
		fila1.print();
	}
}