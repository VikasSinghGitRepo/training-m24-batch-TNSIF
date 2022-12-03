package com.cg.classwwork;

public class ExceptionDemo {

	public static void main(String[] args) {
		try
		{
			System.out.println(5+5);
			System.out.println(2/0);
			System.out.println(3);
		}
		
		catch(ArithmeticException e){
			System.out.println(2/2);
			System.out.println("Inside catch block");
		}
		
		finally {
			System.out.println("I am finally block");
		}
		
		
		System.out.println("I am remaining code");


	}

}
