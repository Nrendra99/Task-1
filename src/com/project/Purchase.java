package com.project;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		Scanner   scanner=new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        float a=scanner.nextFloat();
        

		{	    
		if(a<=500)
	    System.out.println(a);
	    else if(a<=1000)
	    System.out.println(a-(a/10));	
	    else if(a>1000)
	    System.out.println(a-(a/100*20));
	    }

	}

}
