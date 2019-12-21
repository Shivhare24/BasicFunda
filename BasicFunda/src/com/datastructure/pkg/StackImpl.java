package com.datastructure.pkg;
import java.util.Scanner;

public class StackImpl {

	
	static int top =-1;
	static int []arr = new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell wheather you need to push or pop");
		String name = sc.nextLine();
		if("push".equalsIgnoreCase(name)) {
			System.out.println("please enter value to add");
			push(sc.nextInt());
		}
		else if("pop".equalsIgnoreCase(name)) {
			System.out.println("press y to confirm");
			if(("y" == sc.nextLine())||("Y" == sc.nextLine())) {
				StackImpl.pop();
			}
		}
		else System.out.println("Please enter a valid key");
		sc.close();
		
	}
	
	public static boolean push(int i) {
		if(!StackImpl.isFull()) {
			arr[top+1] = i;
			top++;
			return true;
		}
		else System.out.println("Stack is full cannot be inserted");
		return false;
	}
	
	public static int pop() {
		if(!StackImpl.isEmpty()) {
		top = top-1;
		return top-1;
		}
		else System.out.println("stack is empty cannot be deleted");
		return top;
	}
	
	
	public static boolean isEmpty() {
		return (top ==-1)?true:false;
	}
	
	public static boolean isFull() {
		return (top == arr.length-1)?true:false;
	}

}
