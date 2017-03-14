package com;
/**
 * 
 * @author Vishwajit
 *
 */
/*creating our own generic class*/
public class GenDemo {
	//second commit
	public static void main(String[] args) {
		Gen<Integer> gen1=new Gen<Integer>(10);
		gen1.shoow();
		System.out.println("Value is:"+gen1.getOb());
		
		Gen<String> gen=new Gen<String>("swami");
		gen.shoow();
		System.out.println("Value is:"+gen.getOb());
		
		
		Gen<Float> gen2=new Gen<Float>(10.6f);
		gen2.shoow();
		System.out.println("Value is:"+gen2.getOb());
	}

}
