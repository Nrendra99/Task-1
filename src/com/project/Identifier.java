package com.project;

import java.util.Scanner;

public class Identifier {

	public static void main(String[] args) {
		
		Scanner   scanner=new Scanner(System.in); //scanner class used to take input from user
        System.out.println("Please Enter a Number: "); //question printed on console for input
        float a=scanner.nextFloat(); //defining type of input and storing in variable (n)
        
		{	
          if(a<=-1) //condition for negative
          System.out.println("negative");
          else if(a==0)//condition for zero
          System.out.println("zero");	
          else// if both above false 
          System.out.println("positive");
        }
		
}
}
