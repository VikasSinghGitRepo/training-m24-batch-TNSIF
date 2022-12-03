package com.cg.assignment;

public class ReverseNo {
	
	public static void reverseANo(int n) {
		int no=n;//storing value of n in no so n can be used later
		int rev=0;//defining rev variable for storing reverse of a no
		int rem;
		while(n>0) {
			rem=n%10;//storing remainder of n/10 every loop
			rev=(rev*10)+rem;
			n=n/10;
		}
		
		System.out.println("Reverse of a given no is "+ rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseANo(3456789);

	}

}
