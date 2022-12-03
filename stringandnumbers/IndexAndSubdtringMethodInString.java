package com.cg.stringandnumbers;

public class IndexAndSubdtringMethodInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String anotherPalindrome = "Niagara. O roar again!"; 
		char aChar = anotherPalindrome.charAt(9);
		System.out.println("working with charAT "+aChar);
		
		String roar = anotherPalindrome.substring(11, 15); 
		System.out.println("working with subString 11 -15 "+roar);
		
		String roar1=anotherPalindrome.substring(3);
		System.out.println("working with subString 3-end "+roar1);
		
		
		//subSequence method
		System.out.println(anotherPalindrome.subSequence(0, 7));
		
		
		//split method?
		
		
		//trim method
		String a1=anotherPalindrome.trim();
		System.out.println("Using trim method"+a1);
		
		
		//lowerCase and upperCase
		String lower=anotherPalindrome.toLowerCase();
		String upper=anotherPalindrome.toUpperCase();
		System.out.println("Using lowercase method"+lower);
		System.out.println("Using uppercase method"+upper);
		
		
		
		
		
		

		
		
		
		

		



	}

}
