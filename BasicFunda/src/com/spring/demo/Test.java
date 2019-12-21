package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Point p1 = ctx.getBean(Point.class);
		System.out.println(p1.hashCode());
		p1.setX(5);
		p1.setY(8);
		
		Point p2 = ctx.getBean(Point.class);
		System.out.println(p2.hashCode());
		p2.setX(8);
		p2.setY(5);
		
		Line line = ctx.getBean(Line.class);
		line.setPointA(p1);
		line.setPointB(p2);
		
		System.out.println(line);
		
		
	}

}
