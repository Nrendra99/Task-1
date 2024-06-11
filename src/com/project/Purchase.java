package com.project;


import java.util.Scanner;

public class Purchase {

	public static void main(String[] args){
		Scanner   scanner=new Scanner(System.in); //scanner class used to take input from user
        System.out.println("Please Enter Purchase value: "); //question printed on console for input
        float amount=scanner.nextFloat(),a; //defining type of input and storing in variable (amount)
        
        
		if (amount<=500) // no discount applied
		{
			a=amount;
		}
        else if (amount<=1000) // applying 10% discount
		{	    
	        a=(amount-(amount/10));	
		}
	    else       // applying 25% discount
	    {
            a=amount-(amount/100*20);
        }
        
        System.out.println("Payable amount is "+a); //printing payable amount 
	}

}
