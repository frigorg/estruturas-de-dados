package estruturas.arvores;

public class Node<T extends Comparable<T>> {
	
	private T content;
	private Node<T> left;
	private Node<T> right;
	
	public Node() {
		super();
	}

	public Node(T content, Node<T> left, Node<T> right) {
		super();
		this.content = content;
		this.left = left;
		this.right = right;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

}
