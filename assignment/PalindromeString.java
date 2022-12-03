package com.cg.assignment;
import java.util.Scanner;

public class PalindromeString {
	
	
	public static void palindromeString(String s) {
		//char [] ch=s.toCharArray();
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--) {
				s1+=s.charAt(i);
			
		}
		
		if(s1.equals(s)) {
			System.out.println("This is a palindrome String "+s1);

		}
		else {
			System.out.println("This is not a palindrome String "+s1);	
		}
	}

	
	//other logic
	public static void palindromeString2() {
		String original, reverse = " "; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeString("madam");
		palindromeString("vikas");
		
		palindromeString2();

	}

}
