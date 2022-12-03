package com.cg.classwwork;

public class Outer {
	int x= 100;
	static int y=100;
	
	
	//static inner class can access only static members  of outer class
	//so whenevr you want to access only static member of outer class declare inner class as static
	static class Inner
	{
		void display() {
			//System.out.println(x); --error,x is not static
			System.out.println(y);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner obj = new Inner();
		obj.display();

	}

}
