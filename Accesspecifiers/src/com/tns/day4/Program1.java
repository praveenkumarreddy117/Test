package com.tns.day4;

public class Program1 {
	
	public static void main(String[] args) {
		
		//basic to object type
		int a = 10;
		Integer i = new Integer(a);
		
		double b = 5451.14;
		Double d = new Double(b);
		
		//object to basic type
		Integer i1 = new Integer(20);
		int p = i1.intValue();
		
		Double d1 = new Double(326.14);
		double q = d1.doubleValue();
		
		//Auto Boxing
		Integer  i2 = 30;// directly can be assigned.
		Double d2 = 300.506;// directly can be assigned.

		//Auto UnBoxing
		Double  d3= new Double(25.8);
		double  s = d3; 

		System.out.println(i);
		System.out.println(d);
		System.out.println(p);
		System.out.println(q);
		System.out.println(i2);
		System.out.println(d2);
		System.out.println(s);
	}

}
