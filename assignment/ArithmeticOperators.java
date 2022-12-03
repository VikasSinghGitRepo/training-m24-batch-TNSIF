package com.cg.assignment;

public class ArithmeticOperators {
	
	public static void ArithemticDemo() {
		  int result = 1 + 2;
	        // result is now 3
	        System.out.println("1 + 2 = " + result);
	        int original_result = result;

	        result = result - 1;
	        // result is now 2
	        System.out.println(original_result + " - 1 = " + result);
	        original_result = result;

	        result = result * 2;
	        // result is now 4
	        System.out.println(original_result + " * 2 = " + result);
	        original_result = result;

	        result = result / 2;
	        // result is now 2
	        System.out.println(original_result + " / 2 = " + result);
	        original_result = result;

	        result = result + 8;
	        // result is now 10
	        System.out.println(original_result + " + 8 = " + result);
	        original_result = result;

	        result = result % 7;
	        // result is now 3
	        System.out.println(original_result + " % 7 = " + result);
	    }
	
	public static void unaryDemo() {
		  int result = +1;
	        // result is now 1
	        System.out.println(result);

	        result--;
	        // result is now 0
	        System.out.println(result);

	        result++;
	        // result is now 1
	        System.out.println(result);

	        result = -result;
	        // result is now -1
	        System.out.println(result);

	        boolean success = false;
	        // false
	        System.out.println(success);
	        // true
	        System.out.println(!success);
	}
	
	public void prePostDemo() {
		int i = 3;
        i++;
        
        // prints 4
        System.out.println(i);
        
        ++i;	
        
        // prints 5
        System.out.println(i);
        
        // prints 6
        System.out.println(++i);
        
        // prints 6
        System.out.println(i++);
        
        // prints 7
        System.out.println(i);
	}
	
	public static void comparisonOperator() {
		int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    
	}
	
	public static void conditionOperator1() {
		  int value1 = 1;
	        int value2 = 2;
	        if((value1 == 1) && (value2 == 2))
	            System.out.println("value1 is 1 AND value2 is 2");
	        if((value1 == 1) || (value2 == 1))
	            System.out.println("value1 is 1 OR value2 is 1");
	}
	
	public static void conditionOperator2() {
		 int value1 = 1;
	        int value2 = 2;
	        int result;
	        boolean someCondition = true;
	        result = someCondition ? value1 : value2;

	        System.out.println(result);
	}
	
	public static void bitDemo() {
		 int bitmask = 0x000F;
	        int val = 0x2222;
	        // prints "2"
	        System.out.println(val & bitmask);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
