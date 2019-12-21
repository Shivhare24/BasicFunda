package com.ListExample.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		
		Employee e = ctx.getBean(Employee.class);
		e.setEmpId(1);
		e.setEmpName("abc");
		
		EmployeeService es = ctx.getBean(EmployeeService.class);
		es.list.add(e);
		
		
		 for(Employee e1 : es.list) {
			 System.out.println(e1); 
			 }
		 
		
	}

}
