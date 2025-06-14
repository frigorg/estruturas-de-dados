package estruturas.simples;

import java.util.NoSuchElementException;

public class LinkedList<T> {
	
	private Node<T> head;
	private int size;
	
	public LinkedList() {
		super();
		this.head = null;
		this.size = 0;
	}

	public LinkedList(Node<T> head, Node<T> next) {
		super();
		this.head = head;
		this.size = 0;
	}

	public boolean isEmpty() {
		return head == null ? true : false;
	}
	
	public int size() {
		return size;
	}
	
	public void add(T element) {
		if (isEmpty()) {
			head = new Node<T>(element, null);
			size++;
			return;
		}
		
		Node<T> pointer = head;
		while(pointer.getNext() != null) 
			pointer = pointer.getNext();
		
		pointer.setNext(new Node<T>(element, null));
		size++;
	}
	
	private Node<T> getNode(int index) {
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();
		Node<T> pointer = head;
		for (int i = 0; i < index; i++) {
			pointer = pointer.getNext();
		}
		return pointer;		
	}
	
	public T get(int index) {
		return getNode(index).getContent();
	}
	
	public void add(int index, T element) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException();
		
		if (isEmpty() || index == size) {
			add(element);
			return;
		}
		
		if (index == 0) {
			head = new Node<T>(element, head);
			size++;
			return;
		}
		
		Node<T> pointer = getNode(index-1);
		pointer.setNext(new Node<T>(element, pointer.getNext()));
		size++;
	}
	
	public T remove() {
		if (isEmpty())
			throw new NoSuchElementException();
		T aux = head.getContent();
		head = head.getNext();
		size--;
		return aux;
	}
	
	public T remove(int index) {
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();
		
		if (index == 0) 
			return remove();
		
		Node<T> pointer = getNode(index-1);
		T returningValue = pointer.getNext().getContent();
		pointer.setNext(pointer.getNext().getNext());
		size--;
		return returningValue;
	}

	@Override
	public String toString() {
		String output = "";
		Node<T> pointer = head;
		for (int i = 0; i<size; i++) {
			output = output.concat("[" + i + "]->" + pointer.getContent().toString() + "; ");
			pointer = pointer.getNext();
		}
		return "LinkedList " + output;
	}
}
