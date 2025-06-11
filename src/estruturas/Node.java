package estruturas;

public class Node<T> {
	private T content;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T element,Node<T> previous, Node<T> next) {
		super();
		this.content = element;
		this.previous = previous;
		this.next = next;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
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

	@Override
	public String toString() {
		return "" + content;
	}
		
}
