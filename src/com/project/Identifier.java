package com.project;

import java.util.Scanner;

public class Identifier {

	public static void main(String[] args) {
		
		Scanner   scanner=new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        float a=scanner.nextFloat();
        
		
		
		{	
          if(a<=-1)
          System.out.println("negative");
          else if(a==0)
          System.out.println("zero");	
          else
          System.out.println("positive");
        }
		
}
}
