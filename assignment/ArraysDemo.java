package com.cg.assignment;

import java.util.Arrays;


/*
 * Searching an array for a specific value to get the index at which it is placed (the binarySearch method).

Comparing two arrays to determine if they are equal or not (the equals method).

Filling an array to place a specific value at each index (the fill method).

Sorting an array into ascending order. This can be done either sequentially,
 using the sort method, or concurrently, 
 using the parallelSort method introduced in Java SE 8. 
 Parallel sorting
 of large arrays on multiprocessor systems is
  faster than sequential array sorting.
  
   The toString method converts each element of the array 
   to a string, separates them with commas, 
   then surrounds them with brackets.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class ArraysDemo {

	void sort(int...s) {
		
		
		for(int i=0;i<s.length;i++) {
			
		}
		
		
		
	}
	
	
	
	
	public static void arrayOne() {
		   // declares an array of integers
     int[] anArray;

     // allocates memory for 10 integers
     anArray = new int[10];
        
     // initialize first element
     anArray[0] = 100;
     // initialize second element
     anArray[1] = 200;
     // and so forth
     anArray[2] = 300;
     anArray[3] = 400;
     anArray[4] = 500;
     anArray[5] = 600;
     anArray[6] = 700;
     anArray[7] = 800;
     anArray[8] = 900;
     anArray[9] = 1000;

     System.out.println("Element at index 0: "
                        + anArray[0]);
     System.out.println("Element at index 1: "
                        + anArray[1]);
     System.out.println("Element at index 2: "
                        + anArray[2]);
     System.out.println("Element at index 3: "
                        + anArray[3]);
     System.out.println("Element at index 4: "
                        + anArray[4]);
     System.out.println("Element at index 5: "
                        + anArray[5]);
     System.out.println("Element at index 6: "
                        + anArray[6]);
     System.out.println("Element at index 7: "
                        + anArray[7]);
     System.out.println("Element at index 8: "
                        + anArray[8]);
     System.out.println("Element at index 9: "
                        + anArray[9]);
 }
	
	
	public static void arrayTwo() {
		int [] anArray;
		anArray = new int[10];
		
		anArray[0] = 100; // initialize first element
		anArray[1] = 200; // initialize second element
		anArray[2] = 300; // and so forth
		
		System.out.println("Element 1 at index 0: " + anArray[0]);
		System.out.println("Element 2 at index 1: " + anArray[1]);
		System.out.println("Element 3 at index 2: " + anArray[2]);
	}
	
	public static void multiArrayDemo() {
		String[][] names = {
	            {"Mr. ", "Mrs. ", "Ms. "},
	            {"Smith", "Jones"}
	        };
	        // Mr. Smith
	        System.out.println(names[0][0] + names[1][0]);
	        // Ms. Jones
	        System.out.println(names[0][2] + names[1][1]);
	}
	public static void copyArray() {
		String[] copyFrom = {
	            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
	            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
	            "Marocchino", "Ristretto" };
	        
	        String[] copyTo = new String[7];
	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	        for (String coffee : copyTo) {
	            System.out.print(coffee + " ");           
	        }
	        
	        
	    }
	
	public static void copyOfRange() {
		 String[] copyFrom = {
		            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
		            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
		            "Marocchino", "Ristretto" };
		        
		        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
		        for (String coffee : copyTo) {
		            System.out.print(coffee + " ");           
		        }            
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {13,45,33,34,212,12,23,42,34};
		System.out.println("Entered Array is:");
		
		for(int num:arr) {
			System.out.println(num+" ");
		}
		Arrays.sort(arr);
		
		System.out.println("Sorted Array is:");
		for(int num:arr) {
			System.out.println(num+" ");
		}
		
		
		//length is for array and length() is for string
		System.out.println("Length of the given array is "+arr.length);
		

	}

}
