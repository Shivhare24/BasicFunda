package com.SingletonDesignPattern.pkg;
import java.lang.reflect.Constructor;

public class SingletonWithReflection {

	private static SingletonWithReflection singleton = null;

	private SingletonWithReflection() {

	}

	public static SingletonWithReflection getInstance() {

		if (singleton == null) {
			singleton = new SingletonWithReflection();
		}
		return singleton;
	}

}

class SingletonWithReflection_test {

	public static void main(String[] args) {

		SingletonWithReflection s1 = SingletonWithReflection.getInstance();

		SingletonWithReflection s2 = null;

		try {
			@SuppressWarnings("rawtypes")
			Constructor[] constructors = SingletonWithReflection.class
					.getDeclaredConstructors();

			for (@SuppressWarnings("rawtypes") Constructor constructor2 : constructors) {
				constructor2.setAccessible(true);
				s2 = (SingletonWithReflection) constructor2.newInstance();
				break;

			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
