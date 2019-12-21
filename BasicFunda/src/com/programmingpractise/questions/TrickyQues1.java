package com.programmingpractise.questions;

class A {

	public A() {
		show();
		shower();
	}

	public void show() {
		System.out.println("parent class non instance method");
	}
	public static void shower() {
		System.out.println("parent class static method");
	}
}

public class TrickyQues1 extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TrickyQues1();
	}

	public TrickyQues1() {
		show();
		shower();
	}

	public void show() {
		System.out.println("Child class non instance method");
	}
	public static void shower() {
		System.out.println("Child class static method");
	}

}
