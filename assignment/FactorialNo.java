package com.cg.assignment;

public class FactorialNo {
	
	//using recurrsion
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=factorial(5);
		System.out.println(f);

	}

}
