package com.cg.classwwork;

public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main method");
		
	}
		
	
//static block will be executed first even before the main method
	// because static block is executed at the time of class loading
	//i.e. class loader subsystem will execute it
		static {
			System.out.println("I am static method 0");//1st output
		}
		static {
			System.out.println("I am static method 1");//2nd output
		}
		static {
			System.out.println("I am static method 2");//3rd output
		}
		
		
		public static void dummy() {
			System.out.println("I am static dummy method");
		}
		

}


