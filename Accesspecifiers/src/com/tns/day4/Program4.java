package com.tns.day4;

import java.util.Scanner;

public class Program4 {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
	      
	      //Taking the input from user
	      int r = scn.nextInt();
	 
	        // Declaring Jagged array with r rows
	        int arr[][] = new int[r][];
	 
	        //We are creating a Jagged array where the 0th row has 1 element, 
	        //1st row has 2 elements
	        //such that nth row has n+1 elements
	        for (int i = 0; i < arr.length; i++)
	            arr[i] = new int[i + 1];
	 
	        // Initializing array
	        int temp = 0;
	        for (int i = 0; i < arr.length; i++)
	            for (int j = 0; j < arr[i].length; j++)
	                arr[i][j] = temp++;
	 
	        // Displaying the elements of 2-D Jagged array
	        System.out.println("Elements of 2-D Jagged Array for n= " + r);
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++)
	                System.out.print(arr[i][j] + " ");
	            System.out.println();
	        }
		
		
	}

}
