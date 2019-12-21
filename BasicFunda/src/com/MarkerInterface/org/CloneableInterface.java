package com.MarkerInterface.org;

public class CloneableInterface implements Cloneable {

	String name;
	int Id;

	public CloneableInterface(String name, int id) {
		super();
		this.name = name;
		Id = id;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		CloneableInterface ci = new CloneableInterface("something", 101);
		CloneableInterface ciNew = (CloneableInterface)ci.clone();

		System.out.println(ci.Id);
		System.out.println(ci.name);
		
		System.out.println(ciNew.Id);
		System.out.println(ciNew.name);
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
