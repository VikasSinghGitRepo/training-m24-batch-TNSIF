package com.cg.assignment;

public class PalindromeNo {
	
	
	public static void palindromeNo(int n) {
		int no=n;//storing value of n in no so n can be used later
		int rev=0;//defining rev variable for storing reverse of a no
		int rem;
		while(n>0) {
			rem=n%10;//storing remainder of n/10 every loop
			rev=(rev*10)+rem;
			n=n/10;
		}
		
		if(rev==no) {
		System.out.println("No is palindrome no");
		}
		
		else System.out.println("No is not palindrome no");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeNo(5465645);
		palindromeNo(3456);

	}

}
