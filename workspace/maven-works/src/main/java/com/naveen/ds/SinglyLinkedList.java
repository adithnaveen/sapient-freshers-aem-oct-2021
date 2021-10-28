package com.naveen.ds;


// ADT - Abstract Data Types 
public class SinglyLinkedList<E> {
	
	
	class Node<E> {
		private E value;
		private Node<E> next;
		
		public Node(E value, Node<E> next) {
			super();
			this.value = value;
			this.next = next;
		}

		public E getValue() {
			return value;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}
	}
	

	// operations here 

	
	// sentinial nodes 
	private Node<E> head = null; 
	private Node<E> tail = null; 
	private int size  =0; 
	
	
	public void addFirst(E e) {
		head = new Node<E>(e, head); 
		
		if(size ==0) {
			tail = head; 
		}
		size ++; 
	}
	
	
	public boolean isEmpty() {
		return size ==0; 
	}
	
	public void addLast(E e) {
		Node<E> node = new Node<E>(e, null);
		
		if(isEmpty()) {
			head = node; 
		}else  {
			tail.setNext(node);
		}
		
		tail = node; 
		size ++; 
	}

	
	public int getSize() {
		return this.size; 
	}
	
	public E removeFirst() {
		if(isEmpty()) {
			System.out.println("There is nothing to remove");
			return null; 
		}
		
		// the data is available 
		E value = head.getValue();
		head = head.getNext(); 
		size --; 
		if(isEmpty()) {
			tail = null; 
		}
		return value; 
		
	}
	
	public E removeLast() {
		return null; 
	}
	
	
	public void displayAll() {
		
	}
	

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







