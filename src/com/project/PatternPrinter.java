package com.project;
import java.util.Scanner;

public class PatternPrinter {
   
 public static void main(String[] args) {
    Scanner   scanner=new Scanner(System.in); //scanner class used to take input from user
    System.out.println("Please Enter Number of lines: "); //question printed on console for input
    	    	
         int n = scanner.nextInt(); //defining type of input and storing in variable (n)
    	    	      	 
    	       for (int i=0;i<n;i++)  //First Outer Loop that decides Number of lines based on input given by user
    	    	   
    	             {                      
    	         for (int j=n;j>=n-i;j--) //second inner loop that prints (j) until it is equal to the value of (n-i)
    	        	 {
    	    		   System.out.print(j);
    	        	 }
    	         for (int k=i+1;k<n;k++)  //third inner loop that prints (n) as long as (k) is less than (n)
    	        	 {
    	        	   System.out.print(n-i);
    	        	 }
    	         
    	        System.out.println( ); 
    	         }
 
    	     }
    	 
    	    }
