package com.cg.stringandnumbers;

public class StringC_W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how many objects will be created
		String a1 = new String("Vikas");//1 in heap and 1 in string constant pool
		String a2 = new String("Vikas");//1 in heap area
		String a3="Vikas";//no object created in scp
		String a4="Vikas";//no object created in scp as it is there 
		//hence total 3 objects will be created
		
		String s1="vikas";
		String s2="vikas";
		System.out.println(s1==s2);//reference comparison
		
		//can be used for password
		System.out.println(s1.equals(s2));//content comparison
		
		//can be used for username
		System.out.println(s1.equalsIgnoreCase(s2));//compares ignoring capital small alphabets
		
		
		System.out.println(a1==a2);//false   compares reference
		System.out.println(a1.equals(a2));//content comparison
		
		
		System.out.println(s1.compareTo(s2));//return 0 and +ve and -ve value based on result
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
