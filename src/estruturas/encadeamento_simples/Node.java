package estruturas.encadeamento_simples;

public class Node<T> {
	private T content;
	private Node<T> next;
	
	public Node(T element, Node<T> next) {
		super();
		this.content = element;
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
	
	@Override
	public String toString() {
		return "" + content;
	}
		
}
