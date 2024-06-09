package com.project;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner   scanner=new Scanner(System.in);
	    System.out.println("Please Enter a Number: ");
	    int n=scanner.nextInt();
        
        int rem=0, rev=0;
        while(n>0)
        {
        	rem=n%10;
        	rev=(rev*10)+rem;
        	n=n/10;
        	
        }
        System.out.println(rev);
	}

}
