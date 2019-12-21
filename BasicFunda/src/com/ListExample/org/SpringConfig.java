package com.ListExample.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public EmployeeService employeeservice() {
		return new EmployeeService(null);
	}
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
}
