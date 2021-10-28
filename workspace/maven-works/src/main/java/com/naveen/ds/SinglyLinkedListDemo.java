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
	}
}
