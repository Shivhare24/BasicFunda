package com.SingletonDesignPattern.pkg;

 class DoubleCheckedSingleton {

	private static DoubleCheckedSingleton singleton = null;

	private DoubleCheckedSingleton() {
	}

	public static DoubleCheckedSingleton getInstance() {

		if (singleton == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckedSingleton();
				}
			}
		}
		return singleton;
	}

	
	
}	
	
	

public class DoubleCheckedSingleton_test {

	public static void main(String[] args) {

		DoubleCheckedSingleton d1 = DoubleCheckedSingleton.getInstance();
		System.out.println(d1.hashCode());

		DoubleCheckedSingleton d2 = DoubleCheckedSingleton.getInstance();
		System.out.println(d2.hashCode());

	}
	

}
