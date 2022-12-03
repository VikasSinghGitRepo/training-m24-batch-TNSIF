package com.cg.assignment;

public class ReverseString {
	
	public static void reverseAString(String s) {
		char [] ch=s.toCharArray();
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--) {
				s1+=ch[i];
			
		}
		
		System.out.println("Reverse of a given String "+s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseAString("Vikas");

	}

}
