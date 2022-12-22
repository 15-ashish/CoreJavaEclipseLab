//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment


package com.q1;

import java.util.Scanner;

public class Employee extends Member   //properties of Member class get inherited in Employee Class
{
	String specialization;
	
	void input_emp()   //method to take input 
	{
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("..................Employee Input Details....... ");
		 input();//calling base class method
		 System.out.println("Enter Specialization");
		 specialization=sc.next();
		 sc.close();
	}
	void output_emp()   //method to print the details
	{
		System.out.println("Name "+name);
		System.out.println("Age "+Age);
		System.out.println("Phone Number "+Phone_number);
		System.out.println("Address "+Address);
		System.out.println("Specialozation "+specialization);
		System.out.println("Salary "+Salary);
		
	}
	

}
