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
	
	private Node<T> findSmallerNode(Node<T> startingNode) {
		if (startingNode == null)
			return null;
			
		Node<T> iterator = startingNode;
		while (iterator.getLeft() != null) 
			iterator = iterator.getLeft();
		
		return iterator;
	}
	
	public T findSmaller(){
		Node <T> output =  findSmallerNode(root);
		return output == null ? null : output.getContent();
	}
	
	private Node<T> findBiggestNode(Node<T> startingNode) {
		if (startingNode == null)
			return null;
			
		Node<T> iterator = startingNode;
		while (iterator.getRight() != null) 
			iterator = iterator.getRight();
		
		return iterator;
	}
	
	public T findBiggest(){
		Node <T> output =  findBiggestNode(root);
		return output == null ? null : output.getContent();
	}

	private Node<T> findNode(T element) {
		
		Node<T> iterator = root;
		while(true) {
			if (iterator == null) 
				return null;
			else if (element.compareTo(iterator.getContent()) == -1) 
				iterator = iterator.getLeft();
			else if (element.compareTo(iterator.getContent()) == 1)
				iterator = iterator.getRight();
			else
				return iterator;
		}
	}
	
	public boolean find(T element) {
		return findNode(element) == null ? false : true;
	}
	
	public void add(T element) {
		if (root == null) {
			root = new Node<T>(element, null, null);
			size++;
			return;
		}
		
		Node<T> iterator = root;
		
		while(true) {
			if (element.compareTo(iterator.getContent()) == -1 && iterator.getLeft() != null) 
				iterator = iterator.getLeft();
			else if (element.compareTo(iterator.getContent()) == 1 && iterator.getRight() != null)
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
