package com.project;

public class SmallestNUM {

	public static void main(String[] args) {
		
		
		{
		int a=546, b=238, c=549; //assigning value to a,b and c
		
           if(a<b && a<c)  // comparing (a) to (b) and (c)
           {
           System.out.println(a+" is the smallest number");
           }
           
           else if(b<a && b<c) // comparing (b) to (a) and (c)
           {
           System.out.println(b+" is the smallest number");
           }
           
           else  // prints c anyways if both the above conditions are false
           {
           System.out.println(c+" is the smallest number");
           
           }   
}
}
}