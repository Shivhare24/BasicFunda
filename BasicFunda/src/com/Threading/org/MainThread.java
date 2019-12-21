package com.Threading.org;

import java.util.concurrent.Callable;

public class MainThread implements Callable<Object> {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MainThread mt = new MainThread();
		mt.call();
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Callable Interface");
		int index =hashCode("vishal") & 15;
		System.out.println(index);
		return null;
	}
	
	public int hashCode(String s) {
		return (int)s.charAt(0);
		
	}

}
