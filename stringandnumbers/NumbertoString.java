package com.cg.stringandnumbers;

public class NumbertoString {
	
	public static void numToString() {
		
		//1st method
		int i=2;
		// Concatenate "i" with an empty string; conversion is handled for you.
		String s1 = "" + i;
		System.out.println("Using 1st method "+s1);
		
		
		//2nd method
		// The valueOf class method.
		String s2 = String.valueOf(i);
		System.out.println("Using 2nd method "+s2);
		
		
		//3rd method
		int j=1;
		double d=1;
		String s3 = Integer.toString(j); 
		String s4 = Double.toString(d);
		System.out.println("Using 3rd method "+s3+" s4: "+s4);
		
		
		
	}
	
	public static void toStringUse() {
		double d = 858.48;
        String s = Double.toString(d);
        
        int dot = s.indexOf('.');
        
        System.out.println(dot + " digits " +
            "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
            " digits after decimal point.");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numToString();
		toStringUse();

	}

}
