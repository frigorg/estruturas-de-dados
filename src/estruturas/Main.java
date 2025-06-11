package estruturas;

import estruturas.simples.*;

public class Main {

	public static void main(String[] args) {

		Stack<Integer> pilha = new Stack<Integer>();
		assert(pilha.pop() == null):"Pilha estava vazia. Deveria retornar null";
		assert(pilha.isEmpty()):"Pilha deveria estar vazia";
		pilha.push(1);
		assert(!pilha.isEmpty()):"Pilha não deveria estar vazia";
		assert(pilha.top() == 1):"O elemento do topo deveria ser 1.";
		assert(pilha.pop() == 1):"Primeiro elemento a sair deveria ser 1";
		assert(pilha.isEmpty()):"Pilha deveria estar vazia";
		pilha.push(1);
		pilha.push(2);
		assert(pilha.top() == 2):"O elemento do topo deveria ser 2.";
		pilha.push(3);
		assert(pilha.top() == 3):"O elemento do topo deveria ser 3.";
		assert(pilha.pop() == 3):"Elemento a sair deveria ser 3";
		assert(pilha.pop() == 2):"Elemento a sair deveria ser 2";
		assert(pilha.pop() == 1):"Elemento a sair deveria ser 1";
		assert(pilha.isEmpty()):"Pilha deveria estar vazia";
		
		Queue<Integer> fila = new Queue<Integer>();
		assert(fila.dequeue() == null):"Pilha estava vazia. Deveria retornar null";
		assert(fila.isEmpty()):"Pilha deveria estar vazia";
		fila.enqueue(1);
		assert(fila.peek() == 1):"O elemento do fim da fila deveria ser 1, mas foi " + fila.peek();
		assert(!fila.isEmpty()):"Pilha não deveria estar vazia";
		assert(fila.dequeue() == 1):"Primeiro elemento a sair deveria ser 1";
		assert(fila.isEmpty()):"Pilha deveria estar vazia";
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(3);
		fila.enqueue(4);
		assert(fila.peek() == 1):"O elemento do fim da fila deveria ser 3, mas foi " + fila.peek();
		assert(fila.dequeue() == 1):"Primeiro elemento a sair deveria ser 1";
		assert(fila.dequeue() == 2):"Segundo elemento a sair deveria ser 2";
		assert(fila.dequeue() == 3):"Terceiro elemento a sair deveria ser 3";
		assert(fila.dequeue() == 4):"Terceiro elemento a sair deveria ser 4";
		
		/*
		Queue<Integer> fila = new Queue<Integer>();
		assert(fila.isEmpty()):"Fila deveria estar vazia.";
		fila.dequeue();
		assert(fila.isEmpty()):"Fila deveria estar vazia.";
		fila.enqueue(1);
		assert(!fila.isEmpty()):"Fila não deveria estar vazia.";
		fila.enqueue(2);
		assert(!fila.isEmpty()):"Fila não deveria estar vazia.";
		fila.dequeue();
		assert(!fila.isEmpty()):"Fila não deveria estar vazia.";
		fila.dequeue();
		assert(fila.isEmpty()):"Fila deveria estar vazia.";
		*/
		
		/*
		Node<Integer> N1 = new Node<Integer>(1, null, null);
		Node<Integer> N2 = new Node<Integer>(1, null, null);
		Node<Integer> N3 = new Node<Integer>(3, null, null);
		N1.setNext(N2);
		N2.setNext(N3);
		N3.setNext(null);
		N1.setPrevious(null);
		N2.setPrevious(N1);
		N3.setPrevious(N2);
		*/
		
		/*
		Node<Integer> comeco = new Node<Integer>(1, null, null);
		comeco.setNext(new Node<Integer>(2, comeco, null));
		comeco.getNext().setNext(new Node<Integer>(3, comeco, null));
		
		comeco.getNext().setPrevious(comeco);
		comeco.getNext().getNext().setPrevious(comeco.getNext());
		
		comeco.setPrevious(new Node<Integer>(0, null, comeco));
		comeco = comeco.getPrevious();
		*/
		
		System.out.println("fim");
		
	}

}
