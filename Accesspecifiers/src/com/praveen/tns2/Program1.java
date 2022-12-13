package com.praveen.tns2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program1 {
	
	public static void main(String[] args) {
		
		Queue <Integer> obj = new PriorityQueue();
		obj.add(233);
		obj.add(12);
		System.out.println(obj);
		obj.poll();
		System.out.println();
		
		
	}

}
