package com.AdapterDesignPattern.pkg;

public class DriverMain {

	public static void main(String[] args) {
		ChromeDriver cDriver = new ChromeDriver();
		cDriver.getElement();
		cDriver.selectElement();
		
		IEDriver ieDriver = new IEDriver();
		ieDriver.findElement();
		ieDriver.clickElement();
		
		IeAdapter ieAdapter = new IeAdapter(ieDriver);
		ieAdapter.getElement();
		ieAdapter.selectElement();

	}

}
