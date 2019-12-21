package com.Threading.org;

public class RuntimeExceptionInThread implements Runnable{

	public static void main(String[] args) {
		RuntimeExceptionInThread reit = new RuntimeExceptionInThread();
		Thread t = new Thread(reit);
		t.start();

	}

	@SuppressWarnings("finally")
	@Override
	public void run() {
		try {
			//System.out.println(10/0);
			System.out.println("try block");
			throw new RuntimeException();
			
		}
		catch(RuntimeException re) {
			//re.printStackTrace();
			System.out.println("catch block");
			throw new RuntimeException();
			
		}
		finally {
			System.out.println("finally block");
			throw new RuntimeException();
		}
		
	}

}
