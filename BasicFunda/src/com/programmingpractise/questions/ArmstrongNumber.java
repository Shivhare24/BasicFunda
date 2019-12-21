package com.programmingpractise.questions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =153;
		isArmstrong(value);
	}

	private static void isArmstrong(int value) {
		// TODO Auto-generated method stub
		int number =0, data=0;
		int input =value;
		while(value!=0) {
			number = value%10;
			value = value/10;
			data += number*number*number;
		}
		if(data == input) {
			System.out.println("is an ArmStrong");
		}
		else {
			System.out.println("is not a ArmStong");
		}
	}

}
