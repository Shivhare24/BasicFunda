/*
 * Java Program to Implement LinkedList and it's methods
 */
package com.datastructure.pkg;

 class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class LinkedList {

	private Node head;
	public boolean isEmpty() {
		return (head == null);
	}

	public void append(int data) {
		if (isEmpty()) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	public void delete(int data) {
		if (isEmpty())return;
		if(head.data == data) {
			head= head.next;
			return;
		}

		Node current = head;
		while(current.next !=null) {
			if(current.next.data ==data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	 public void printList(LinkedList list) 
	    { 
	        Node current = list.head; 
	        System.out.print("LinkedList: "); 
	   
	        while (current != null) { 
	            System.out.print(current.data + " ");
	            current = current.next; 
	        } 
	    } 
	 
	 @SuppressWarnings("null")
	public Node findMiddle() {
		 Node pNode;
		 Node qNode;
		 
		 pNode=qNode=head;
		 
		 while((qNode==null) && (qNode.next==null)) {
			 pNode=pNode.next;
			 qNode=qNode.next.next;
		 }
		 return pNode;
	 }

}
class TestLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(3);
		list.append(5);
		list.append(6);
		list.append(9);
		list.append(11);
		list.append(-98);
		list.append(33);

		list.printList(list);
		System.out.println();
		System.out.println("Middle Number is ");
		list.findMiddle();
	}
}