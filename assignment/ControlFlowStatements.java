package com.cg.assignment;



public class ControlFlowStatements {
	
	
	public static void ifElse(){
		 int testscore = 76;
	     char grade;

	     if (testscore >= 90) {
	         grade = 'A';
	     } else if (testscore >= 80) {
	         grade = 'B';
	     } else if (testscore >= 70) {
	         grade = 'C';
	     } else if (testscore >= 60) {
	         grade = 'D';
	     } else {
	         grade = 'F';
	     }
	     System.out.println("Grade = " + grade);
	}
	
	

	public static void switchCase() {
		int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
	}
	
	
	public static void switchDemoFallThrough() {
		
		java.util.ArrayList<String> futureMonths =
	            new java.util.ArrayList<String>();

	        int month = 8;

	        switch (month) {
	            case 1:  futureMonths.add("January");
	            case 2:  futureMonths.add("February");
	            case 3:  futureMonths.add("March");
	            case 4:  futureMonths.add("April");
	            case 5:  futureMonths.add("May");
	            case 6:  futureMonths.add("June");
	            case 7:  futureMonths.add("July");
	            case 8:  futureMonths.add("August");
	            case 9:  futureMonths.add("September");
	            case 10: futureMonths.add("October");
	            case 11: futureMonths.add("November");
	            case 12: futureMonths.add("December");
	                     break;
	            default: break;
	        }

	        if (futureMonths.isEmpty()) {
	            System.out.println("Invalid month number");
	        } else {
	            for (String monthName : futureMonths) {
	               System.out.println(monthName);
	            }
	        }
	}
	
	public static void calculateFebDays() {
		int month = 2;
        int year = 2000;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                           + numDays);
	}
	
	
	public static void whileDemo() {
		int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
	}
	
	public static void doWhileDemo() {
		  int count = 1;
	        do {
	            System.out.println("Count is: " + count);
	            count++;
	        } while (count < 11);
	}
	
	public static void forLoop() {
		for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
       }
	}
	
	public static void forEachLoop() {
		 int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
	}
	
	public static void searchInArrayBreakDemo() {
		int[] arrayOfInts = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
	}
	
	public static void breakWithLabelDemo() {
		 int[][] arrayOfInts = { 
		            { 32, 87, 3, 589 },
		            { 12, 1076, 2000, 8 },
		            { 622, 127, 77, 955 }
		        };
		        int searchfor = 12;

		        int i;
		        int j = 0;
		        boolean foundIt = false;

		    search:
		        for (i = 0; i < arrayOfInts.length; i++) {
		            for (j = 0; j < arrayOfInts[i].length;
		                 j++) {
		                if (arrayOfInts[i][j] == searchfor) {
		                    foundIt = true;
		                    break search;
		                }
		            }
		        }

		        if (foundIt) {
		            System.out.println("Found " + searchfor + " at " + i + ", " + j);
		        } else {
		            System.out.println(searchfor + " not in the array");
		        }
		        
		        
		        
	}
	
	public static void continueWithLabelDemo() {
		 String searchMe = "Look for a substring in me";
	        String substring = "sub";
	        boolean foundIt = false;

	        int max = searchMe.length() - 
	                  substring.length();

	    test:
	        for (int i = 0; i <= max; i++) {
	            int n = substring.length();
	            int j = i;
	            int k = 0;
	            while (n-- != 0) {
	                if (searchMe.charAt(j++) != substring.charAt(k++)) {
	                    continue test;
	                }
	            }
	            foundIt = true;
	                break test;
	        }
	        System.out.println(foundIt ? "Found it" : "Didn't find it");
	}
         
         
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
