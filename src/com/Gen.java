package com;

public class Gen<T> {
	
	private T ob;

	public T getOb() {
		return ob;
	}

	public Gen(T ob) {
		this.ob = ob;
	}
	public void shoow()
	{
		System.out.println("Type of ob is"+ob.getClass().getName());
	}

	

}
