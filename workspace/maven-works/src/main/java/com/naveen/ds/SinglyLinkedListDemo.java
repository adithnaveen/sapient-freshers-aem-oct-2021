package com.naveen.ds;

public class SinglyLinkedListDemo {
	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		
		System.out.println(list);
		list.addFirst("Arti");
		System.out.println(list);
		list.addFirst("Bhavya");
		System.out.println(list);
		list.addLast("Lokesh");
		System.out.println(list);
		
		list.displayAll();
		
		System.out.println("Remove last ---------");
		System.out.println(list.removeLast());  

		System.out.println("------------------");
		list.displayAll();
		
		
	}
}
