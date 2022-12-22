//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment



package com.q1;

import java.util.Scanner;

public class Manager extends Member   //properties of Member class get inherited in Employee Class
{

	String department;
	void input_manager()  //method to take input
	{
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("..................Manager Input Details....... ");
		input();//calling base class method
		 System.out.println("Enter Department ");
		 department=sc.next();
		 sc.close();
	}
	void out_manager()  //method to print the details

	{
		System.out.println("Name "+name);
		System.out.println("Age "+Age);
		System.out.println("Phone Number "+Phone_number);
		System.out.println("Address "+Address);
		System.out.println("Department "+department);
		System.out.println("Salary "+Salary);
	}
	 
}
