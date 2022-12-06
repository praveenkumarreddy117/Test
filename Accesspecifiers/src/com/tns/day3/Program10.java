package com.tns.day3;

public class Program10 {
	
	public static void main(String[] args) {
		
		//implicit casting
		
		byte b=5;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		//Explicit casting
		
		double p=10.5;
		float q=(float)p;
		long r=(long)q;
		int y=(int)r;
		short x=(short)y;
		byte z=(byte)x;
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(y);
		System.out.println(x);
		System.out.println(z);
		
	}

}
