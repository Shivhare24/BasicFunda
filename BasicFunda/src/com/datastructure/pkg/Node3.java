package com.datastructure.pkg;
public class Node3 {
	int data;
	Node3 next;

	public Node3(int data) {
		this.data = data;
	}

}

class methods{
	Node3 head;
	
	
	public static void main(String s []) {
		
		Node3 node = new Node3(3);
		Node3 node1 = new Node3(6);
		Node3 node2 = new Node3(9);
		Node3 node3 = new Node3(12);
		
		Node3 head = node;
		node.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		printList(head);
		delete ( node1);
		printList(head);
	}
	
	public static void delete( Node3 node ) {
		
		node.data = node.next.data;
		node.next = node.next.next;
	}
	public static void printList(Node3 node) {
		Node3 temp = node;
		while( temp != null ) {
			System.out.println(temp.data+ "  ");
			temp = temp.next;
		}  
	}
	
}


