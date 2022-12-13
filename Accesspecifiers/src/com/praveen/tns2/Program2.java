package com.praveen.tns2;

import java.util.ArrayList;

public class Program2 {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(3);//add(object e (adding an object index position from 0)
		a.add(5.6);//''
		a.add("Dinga");//''
		a.add(null);//''
		a.add(3);//''
		a.add(78);//''
		System.out.println(a);//printing the array
		a.add(4,"tom");//add(int index object e () (4th index value will be change as a tom )
		System.out.println("----------");
		System.out.println(a);//printing an array after changed the 4th index value
		System.out.println("----------");
		System.out.println(a.contains(30));//contains(object e )( o/p is false because of object 30 is not present )
		System.out.println("----------");
		System.out.println(a.get(3)); // get(int index)(getting value of index 3rd position)
		System.out.println("----------");
		System.out.println(a.indexOf(3));// indexOf(int index)(getting the object position of first ocurance)
		System.out.println("----------");;
		a.set(4, 99);// set(int index object e)(adding the 4 index as 99)
		System.out.println("----------");
		System.out.println(a);
		System.out.println("----------");
		System.out.println(a.size());// geting the size of collection or no.of object present in collection
		System.out.println("----------");
		System.out.println(a.isEmpty());// checking the objects present or not if present o/p is true
		a.remove(2);// remove(object e)  delecting the 2nd index position value
		System.out.println("----------");
		System.out.println(a);
		System.out.println("----------");
		ArrayList a1 = new ArrayList();
		a1.addAll(a);//addAll() is adding all the objects into a collection
		System.out.println("----------");
		System.out.println(a1);
		System.out.println("----------");
		System.out.println(a1.size()); // getting the size of the second created array
		System.out.println("----------");
		ArrayList a2 = new ArrayList();
		a2.add(99);
		a2.add(222);
		a2.add(98.99);
		a2.add("Rolex");
		System.out.println("----------");
		System.out.println(a2);
		a2.addAll(2,a1); //adding the objects from the 2nd index position and remaing objects will be added 
		System.out.println("----------");
		System.out.println(a2);
		
		
		
		
	}

}
