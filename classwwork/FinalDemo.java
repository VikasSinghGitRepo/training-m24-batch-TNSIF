package com.cg.classwwork;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=25;
		//we can change value of int later
		
		final int b=20;
		//now we can't change value of b afterwards as it is constant now

	}
	
	class Parent{
		void Property() {
			System.out.println("this is Parent property");
		}
		
		final void Marry() {
			System.out.println("Amie");
		}
	}
	
	class Child extends Parent{
		
		//can't override marry method if it's declared static
//		void Marry() {
//			System.out.println("Minnie");
//		}
	}

}
