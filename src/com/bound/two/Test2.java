package com.bound.two;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void m1(List<String> al)
	{
		System.out.println(al);
		al.add("jadhav");
		System.out.println(al);
	}
	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("swami");
		al.add("vishwajit");
		al.add("vishal");
		
		System.out.println(al);
		m1(al);
		System.out.println(al);
		
	}

}
