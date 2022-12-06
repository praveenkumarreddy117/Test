package com.praveen.tns1;

public class Program1 {
	
	public static int a = 10;
	public void praveen() {
		System.out.println("i am with praveen");
	}
	protected static int b = 20;
	protected void run(){
		System.out.println("in run method");
	}
	static int c = 30;
	void check(){
		System.out.println("in check method");
	}
	private static int d = 40;
	private void get(){
		System.out.println("in get method");
	}
	public static void main(String[] args) {
			
		Program1 p1 = new Program1();
		
		System.out.println(a);
		p1.praveen();
		System.out.println(b);
		p1.run();
		System.out.println(c);
		p1.check();
		System.out.println(d);
		p1.get();
		
	}
	

}
