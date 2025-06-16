package estruturas.encadeamento_duplo;

public class Node<T> {
	
	private T element;
	private Node<T> next;
	private Node<T> previous;
	
	public Node() {
		super();
		this.element = null;
		this.next = null;
		this.previous = null;
	}

	public Node(T element, Node<T> previous, Node<T> next) {
		super();
		this.element = element;
		this.previous = previous;
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
}
