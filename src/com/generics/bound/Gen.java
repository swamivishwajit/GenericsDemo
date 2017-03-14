package com.generics.bound;


/**
 * 
 * @author Vishwajit
 *
 * @param <T>
 */
/*
 * Bounding the Type parameter to perticular type
 */
public class Gen<T extends Number> {
	T ob,ob1;
	public Gen(T ob,T ob1)
	{
		this.ob=ob;
		this.ob1=ob1;
	}
	
	public void add()
	{
		
	}
	

}
