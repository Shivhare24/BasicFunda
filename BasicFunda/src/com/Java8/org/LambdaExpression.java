package com.Java8.org;

interface A{
	public void show();
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A() {
			public void show() {
				System.out.println("without Lamda Expression");
			}
		};
		obj1.show();
		
		A obj2 = () -> System.out.println("with Lamda Expression");
		obj2.show();
	}

}
