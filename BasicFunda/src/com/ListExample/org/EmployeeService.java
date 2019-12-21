package com.ListExample.org;

import java.util.List;

public class EmployeeService {

	List<Employee> list;

	public EmployeeService(List<Employee> list) {
		// TODO Auto-generated constructor stub
		this.list=list;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
}
