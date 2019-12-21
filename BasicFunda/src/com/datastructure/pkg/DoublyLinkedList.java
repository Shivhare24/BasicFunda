package com.datastructure.pkg;


class Node2{

	int data;
	Node2 nextNode2;
	Node2 prevNode2;
	
	public Node2(Node2 preNode2, int data, Node2 nexNode2) {
		this.data=data;
	}
	
}
public class DoublyLinkedList {

	Node2 headNode2;
	private int size;
	
	public void append(int data, int index) {
		if(isEmpty()) return;
		if(index <1 || index >size)return;
		
		Node2 currentNode2 = headNode2;
		int i =1;
		while(i<index) {
			currentNode2=currentNode2.nextNode2;
			i++;
		}
		if(currentNode2.prevNode2==null) {
			Node2 node2 = new Node2(null,data,currentNode2);
			currentNode2.prevNode2=node2;
			headNode2=node2;
		}
		else {
			Node2 node2 = new Node2(currentNode2.prevNode2, data, currentNode2);
			currentNode2.prevNode2.nextNode2=node2;
			currentNode2.prevNode2=node2;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void print() {
		Node2 cuNode2 = headNode2;
		while(cuNode2.nextNode2!=null) {
			System.out.println(cuNode2.data);
			cuNode2=cuNode2.nextNode2;
		}
	}
	
	public void delete(int data) {
		if(isEmpty())return;
		if(headNode2.data==data) {
			headNode2 = headNode2.nextNode2;
			return;
		}
		Node2 currNode2 = headNode2;
		while (currNode2.nextNode2!=null) {
			if(currNode2.nextNode2.data==data) {
				currNode2.nextNode2= currNode2.nextNode2.nextNode2;	
				return;
			}
			currNode2=currNode2.nextNode2;
					
		}
		size--;
	}
	
	private boolean isEmpty() {
		return (headNode2==null);
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.append(1, 0);
		dll.append(3, 2);
		dll.append(2, 1);
		
		dll.print();
		
		
	}
}
