package estruturas;

public class Stack<T> {
	private Node<T> head;
	
	public Stack() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null ? true : false;
	}
	
	public void push(T element) {
		Node<T> temp = head;
		head = new Node<T>(element, temp);
	}
		
	public T pop() {
		if (!isEmpty()) {
			T temp = head.getContent();
			head = head.getNext();
			return temp;
		}
		return null;
	} 
	
	public T top() {
		return !isEmpty() ? head.getContent() : null;
	}
}
