package com.cg.assignment;

public class StringDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("VIKAS");
		s.concat("SINGH");
		System.out.println(s);
		
		//StringBuffer Class
		StringBuffer s1 = new StringBuffer("VIKAS");
		s1.append("SINGH");
		System.out.println(s1);
		
		String upper =s.toUpperCase();
		String lower =s.toLowerCase();
		System.out.println("UPperCase"+upper);
		System.out.println("LowerCase"+lower);
		
		
		
		
		System.out.println(s.substring(2));//(0,2)
		System.out.println(s.substring(2,5));//(2-5)
		
		
		

	}

}
