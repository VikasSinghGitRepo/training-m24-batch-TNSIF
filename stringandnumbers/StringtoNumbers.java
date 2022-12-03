package com.cg.stringandnumbers;

//we can run this program through cmd only
//use javac StringtoNumbers to convert it in .class file
//the use (java StringtoNumbers 20 30) to run this file

public class StringtoNumbers {
	
	public static void StringtoNum(String [] s) {
		if (s.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(s[0])).floatValue(); 
            float b = (Float.valueOf(s[1])).floatValue();

//instead of valueOf parseFloat methoda can be used
//        float a = Float.parseFloat(s[0]);
//            float b = Float.parseFloat(s[1]);    
          

            // do some arithmetic
            System.out.println("a + b = " +
                               (a + b));
            System.out.println("a - b = " +
                               (a - b));
            System.out.println("a * b = " +
                               (a * b));
            System.out.println("a / b = " +
                               (a / b));
            System.out.println("a % b = " +
                               (a % b));
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
        }
        
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	  // this program requires two 
        // arguments on the command line 
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(args[0])).floatValue(); 
            float b = (Float.valueOf(args[1])).floatValue();

            // do some arithmetic
            System.out.println("a + b = " +
                               (a + b));
            System.out.println("a - b = " +
                               (a - b));
            System.out.println("a * b = " +
                               (a * b));
            System.out.println("a / b = " +
                               (a / b));
            System.out.println("a % b = " +
                               (a % b));
        } else {
            System.out.println("This program " +
                "requires two command-line arguments.");
        }*/
        
        
        
        //calling StringtoNum
		String [] s= {"20","30"};
		StringtoNum(s);
        
        
        
	}

}
