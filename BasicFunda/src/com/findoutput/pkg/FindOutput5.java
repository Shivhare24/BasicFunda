package com.findoutput.pkg;

public class FindOutput5 {

	public static void main(String[] args) {
		House house = new House(241);
	}
	

}

class House{
	int size;
	
	public House(int Wallsize) {
		size = Wallsize;
		System.out.println("The Wall Height is " + size);
	}
}
