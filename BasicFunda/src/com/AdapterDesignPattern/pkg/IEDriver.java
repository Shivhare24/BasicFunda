package com.AdapterDesignPattern.pkg;

public class IEDriver implements AppDriver {

	@Override
	public void findElement() {
		System.out.println("find element from IE Driver");
		
	}

	@Override
	public void clickElement() {
		System.out.println("CLick Element from IE Driver");
		
	}

}
