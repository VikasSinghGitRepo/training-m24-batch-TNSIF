package com.cg.stringandnumbers;
public class StringDemoPalindrome {
	
	
	
	public static void palindromeString() {
		String palindrome = "Dot saw I was Tod";
	    int len = palindrome.length();
	    char[] tempCharArray = new char[len];
	    char[] charArray = new char[len];
	    
	    // put original string in an 
	    // array of chars
	    for (int i = 0; i < len; i++) {
	        tempCharArray[i] = 
	            palindrome.charAt(i);
	    } 
	    
	    // reverse array of chars
	    for (int j = 0; j < len; j++) {
	        charArray[j] =
	            tempCharArray[len - 1 - j];
	    }
	    
	    String reversePalindrome =
	        new String(charArray);
	    System.out.println(reversePalindrome);
	}
	
	
	public static void palindromeWithGetCharMethod() {
		String palindrome = "Dot saw I was Tod";
	    int len = palindrome.length();
	    char[] tempCharArray = new char[len];
	    char[] charArray = new char[len];
	    
	    //public void getChars(int srcBeginIndex, int srcEndIndex, 
	    //                   char[] destination, int dstBeginIndex);
	 
	    palindrome.getChars(0, len, tempCharArray, 0);
	    
	   // palindrome.getChars(len-1, 0, charArray,0);
	    
	    for (int j = 0; j < len; j++) {
	        charArray[j] =
	            tempCharArray[len - 1 - j];
	    }
	    
	    String reversePalindrome =
	        new String(charArray);
	    System.out.println(reversePalindrome);
	      
		
	}
	
	
	public static void concatenateDemo() {
		String string1="Vikas";
		String string2="Singh";
		String string3=string1.concat(string2); //This returns a new string that is string1 with string2 added to it at the end.
		
		System.out.println(string3);
		
		
		
		//creating format statements
		String fs;
		float floatVar=1;
		int intVar=1;
		String stringVar="this is string variable";
		fs = String.format("The value of the float " +
		                   "variable is %f, while " +
		                   "the value of the " + 
		                   "integer variable is %d, " +
		                   " and the string is %s",
		                   floatVar, intVar, stringVar);
		System.out.println(fs);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling palindrome String
		palindromeString();
		
		concatenateDemo();

	}

}
