package estruturas.simples;

public class Queue<T> {
	private Node<T> head;
	private Node<T> tail;
	
	public Queue() {
		this.head = null;
		this.tail = null;
	}

	public void enqueue(T element) {
		
		if (isEmpty()) {
			head = new Node<T>(element, null);
			tail = head;
			return;
		}
		
		if (tail == head) {
			tail = new Node<T>(element, head);
			return;
		}
		
		tail = new Node<T>(element, tail);
	}
	
	public T dequeue() {
		if (isEmpty())
			return null;
		
		Node<T> i = tail;
		Node<T> j = tail;
		while(true) {
			if (j.getNext() != null) {
				i = j;
				j = j.getNext();
			} else {
				i.setNext(null);
				break;
			}
		}
		T aux = j.getContent();
		if (i == j)
			tail = null;
		j = head = null;
		return aux;
	}
	
	public boolean isEmpty() {
		return tail == null ? true : false;
		
	}
	
	public T peek() {
		return head.getContent();
	}
}
