package estruturas.simples;

public class Stack<T> {
	private Node<T> top;
	
	public Stack() {
		this.top = null;
	}

	public boolean isEmpty() {
		return top == null ? true : false;
	}
	
	public void push(T element) {
		top = new Node<T>(element, top);
	}
		
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		T temp = top.getContent();
		top = top.getNext();
		return temp;
	} 
	
	public T top() {
		return !isEmpty() ? top.getContent() : null;
	}
}
