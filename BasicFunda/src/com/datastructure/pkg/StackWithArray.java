package com.datastructure.pkg;

public class StackWithArray {
	 int input;
	 int arr[] ;
	 int top = -1;
	
	public StackWithArray(int input) {
		this.input = input;
		arr= new int[this.input];
	}
	
	public  boolean push(int value) {
		if(!isFull()) {
			arr[top+1] = value;
			top++;
			return true;

		}
		else System.out.println("stack overflow");
		return false;
	}
	
	public int pop() {
		if(!isEmpty()) {
			return arr[top--];
		}
		else System.out.println("stack is empty");
		return 0;
	}
	
	public  boolean isFull() {
		return (top == arr.length-1)?true:false;
		
	}
	
	public  boolean isEmpty() {
		return (top ==-1)?true:false;
		
	}

}

class test{
	public static void main(String[] args) {
		StackWithArray swa = new StackWithArray(7);
		swa.push(2);
		swa.push(5);
		swa.push(6);
		swa.push(7);
		swa.push(1);
		swa.push(3);
		swa.push(9);
	
		for (int  i : swa.arr) {
			System.out.println(i);

		}
		
		System.out.println(swa.pop());
		System.out.println(swa.pop());
		
	}
}
