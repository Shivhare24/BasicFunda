package com.AdapterDesignPattern.pkg;

public class IeAdapter implements WebDriver {
	
	IEDriver ieDriver1;
	
	public IeAdapter(IEDriver ieDriver1) {
		this.ieDriver1 = ieDriver1;
	}

	@Override
	public void getElement() { 
		ieDriver1.findElement();
		
	}

	@Override
	public void selectElement() {
		ieDriver1.clickElement();
		
	}

}
