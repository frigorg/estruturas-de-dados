package estruturas.arvores;

import java.util.NoSuchElementException;

public class BinaryTree<T extends Comparable<T>> {

	private Node<T> root;
	private int size;
	
	public BinaryTree() {
		super();
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	private Node<T> findSmaller(Node<T> startingNode) {
		if (startingNode == null)
			throw new NoSuchElementException();
			
		Node<T> iterator = startingNode;
		while (iterator.getLeft() != null) 
			iterator = iterator.getLeft();
		
		return iterator;
	}
	
	private Node<T> findBiggest(Node<T> startingNode) {
		if (startingNode == null)
			throw new NoSuchElementException();
			
		Node<T> iterator = startingNode;
		while (iterator.getRight() != null) 
			iterator = iterator.getRight();
		
		return iterator;
	}

	private Node<T> findNode(T element) {
		//TODO
		return null;
	}
	
	public void add(T element) {
		if (root == null) {
			root = new Node<T>(element, null, null);
			size++;
			return;
		}
		
		Node<T> iterator = root;
		
		while(true) {
			if (element.compareTo(iterator.getContent()) == -1 && iterator.getLeft() != null) {
				iterator = iterator.getLeft();
			} else if (element.compareTo(iterator.getContent()) == 1 && iterator.getRight() != null)
				iterator = iterator.getRight();
			else
				break;
		}
		
		if (iterator.getContent().compareTo(element) == 0)
			return;
		
		if (element.compareTo(iterator.getContent()) == -1) {
			iterator.setLeft(new Node<T>(element, null, null));
			size++;
			return;
		} else {
			iterator.setRight(new Node<T>(element, null, null));
			size++;
			return;
		}
		
	}
	
}
