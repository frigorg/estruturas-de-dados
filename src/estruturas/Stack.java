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
		Node<T> newElement = new Node<T>(element, null, temp);
		temp.setPrevious(newElement);
		head = newElement;
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
