package com.bound.two;
/*
 * 
 * we can define bounded type even in combination also
 * 
 */
public class Test<T extends Runnable> {
	T t;
	public Test(T t)
	{
		this.t=t;
	}
	public static void main(String[] args) {
		Test<Runnable> test=new Test<Runnable>(new Thread() );
	}

}
