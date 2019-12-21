package com.deloitte.com;

public class mytest4 {

	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		if(s1.length() != s2.length()) {
			System.out.println("Unequal Length");
		}
		else {
			String s3 = s1 + s1;
			if(s3.contains(s2)) {
				System.out.println("Verfied");
			}
			else {
				System.out.println("Not verified");
			}
		}

	}

}
