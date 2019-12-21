package com.datastructure.pkg;

public class CyclicLinkedList {

	public static void main(String[] args) {
	
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node1;
		
		Node temp = node1;
		while(temp.next!=node1) {
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println(temp.data);
		System.out.println(hasCycle(node1));
		
		
	}
	
	public static boolean hasCycle(Node head) {
		if(head ==null) return false;
		Node fastNode =head;
		Node slowNode =head;
		
		while(fastNode!=null && slowNode!=null) {
			if(fastNode==slowNode) {
				return true;
			}
			fastNode=fastNode.next.next;
			slowNode=slowNode.next;
		}
		return false;
	}
}
