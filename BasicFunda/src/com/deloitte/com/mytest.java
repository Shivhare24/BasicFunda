package com.deloitte.com;

public class mytest {

	public static void main(String[] args) throws test2 {
		try {
			int a =30;
			if(a==40) {
				throw new test1();
			}
			else {
				throw new test2();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class test1 extends RuntimeException{

	@Override
	public String toString() {
		return "test1";
	}
	
}

class test2 extends Throwable{

	@Override
	public String toString() {
		return "test2";
	}
	
	
}
