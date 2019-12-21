package com.AdapterDesignPattern.pkg;

public class ChromeDriver implements WebDriver{

	@Override
	public void getElement() {
		System.out.println("get element from chrome driver");
		
	}

	@Override
	public void selectElement() {
		System.out.println("select element from chrome driver");
		
	}

}
