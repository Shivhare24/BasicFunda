package com.datastructure.pkg;


public class StackWithLinkedList {

	private Node head;
	
	private class Node{
		int value;
		Node nextNode;
	}
	
	public StackWithLinkedList() {
		head = null;
	}
	
	public int pop() throws LinkedListEmptyException{
		if(head == null) 
		{
			throw new LinkedListEmptyException();
		}
		int value= head.value;
		head=head.nextNode;
		return value;
	}
	
	public void push(int value) {
		Node oldNode= head;
		head= new Node();
		head.value= value;
		head.nextNode=oldNode;
	}
	
	public void printLinkedList(Node head) {
		Node tempNode = head;
		while(tempNode !=null) {
			System.out.println(tempNode.value);
			tempNode=tempNode.nextNode;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	StackWithLinkedList stackWithLinkedList= new StackWithLinkedList();
	stackWithLinkedList.push(3);
	stackWithLinkedList.push(6);
	stackWithLinkedList.push(8);
	
	stackWithLinkedList.printLinkedList(stackWithLinkedList.head);
	
	stackWithLinkedList.pop();
	stackWithLinkedList.printLinkedList(stackWithLinkedList.head);
	}

}

@SuppressWarnings("serial")
class LinkedListEmptyException extends RuntimeException{
	
	@SuppressWarnings("unused")
	private static final long serialversionUID = 1L;
	
	public LinkedListEmptyException() {
		super();
	}
	
	public LinkedListEmptyException(String message) {
		super(message);
	}
}
