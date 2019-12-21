package com.reflection.pkg;

import java.lang.reflect.Field;

import org.springframework.beans.propertyeditors.ClassArrayEditor;

public class Reflection1 {

	public static void main(String[] args) {
		try {
			Class<?> cls =Class.forName("com.reflection.pkg.Welcome");
			Field field = cls.getDeclaredField("nameString");
			field.setAccessible(true);
			Object object =field.get(new Welcome());
			System.out.println((String)object);
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
