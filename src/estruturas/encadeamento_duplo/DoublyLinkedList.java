package estruturas.encadeamento_duplo;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
	
	private int size;
	private Node<T> first;
	private Node<T> last;
	
	public DoublyLinkedList() {
		super();
		this.size = 0;
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		if (size == 0) 
			return true;
		return false;
	}
	
	private Node<T> getNode(int index) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException();
		
		if (isEmpty()) 
			throw new NoSuchElementException();
		
		Node<T> iterator = first;
		for (int i = 1; i<=index; i++) 
			iterator = iterator.getNext();
		return iterator;
	}
	
	public T get(int index) {
		return getNode(index).getElement();
	}
	
	public void add(T element) {
		if (isEmpty()) {
			first = last = new Node<T>(element, null, null);
			size++;
			return;
		}
		
		Node<T> previous = last;
		last = new Node<T>(element, last, null);
		previous.setNext(last);
		size++;
	}
	
	public void addLast(T element) {
		add(element);
	}
	
	public void addFirst(T element) {
		if (isEmpty()) {
			add(element);
			return;
		}
		
		Node<T> next = first;
		first = new Node<T>(element, null, first);
		next.setPrevious(first);
		size++;
	}
	
	public void add(int index, T element) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException();
		
		if (isEmpty()) {
			add(element);
			return;
		}
		
		if (index == 0) {
			addFirst(element);
			return;
		}
		
		if (index == size) {
			add(element);
			return;
		}
		
		Node<T> iterator = first;
		for (int i = 1; i<=index; i++) 
			iterator = iterator.getNext();
		
		Node<T> newElement = new Node<T>(element, iterator.getPrevious(), iterator);
		iterator.getPrevious().setNext(newElement);
		iterator.setPrevious(newElement);
		size++;
	}
	
	@Override
	public String toString() {
		String output = "";
		Node<T> iterator = first;
		for (int i = 0; i<size; i++) {
			output = output.concat("[" + i + "]->" + iterator.getElement().toString() + "; ");
			iterator = iterator.getNext();
		}
		return "DoublyLinkedList " + output;
	}
	
}
