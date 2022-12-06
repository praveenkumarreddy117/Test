package com.praveen.pkr;

public class Finalkeyword {
	
	public void display()
	{
	final int A;
			
	A=20;      // valid sinced A is not initialized.
			
	// A=30; invalid, final variable doesn't take second time assignment.
	
	System.out.println(A);
	
	}
	final int B=15;
	
	public void run()
	{
	// A=20;invalid,final data member can not be modified from the methods.
		
	System.out.println(B);	
	}
    public static void main(String[] args) {
    	
    	Finalkeyword fk = new Finalkeyword();
    	
		fk.display();
		fk.run();
	}
	


}
