package com.cg.classwwork;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		int [] arr= new int[4];
		
		try {
			
			//risky code
		System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			//handling code
			System.out.println("Index value invalid please check the index value");
		}

	}

}
