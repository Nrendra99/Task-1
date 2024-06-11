package com.project; 

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //scanner class used to take input from user
	    System.out.println("Please Enter a Number: "); //question printed on console for input
	    int n=scanner.nextInt(); //defining type of input and storing in variable n
        
        int rem=0, rev=0; //initializing two variables rem and rev 
        while(n>0)        // setting condition for the while loop to execute 
        {
        	rem=n%10;     // isolating the last number
        	rev=(rev*10)+rem; //moving rem to the first place
        	n=n/10;       // modifying value of n to remove the last number
        	
        }
        System.out.println(rev);
	}

}
   