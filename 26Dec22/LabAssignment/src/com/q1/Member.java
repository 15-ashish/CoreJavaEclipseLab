//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment


package com.q1;

import java.util.Scanner;

public class Member {

	String name;
	int Age;
	long Phone_number;
	String Address;
	float Salary;
	float printSalary()
	{
		return Salary;
	}
	 public void input()   //Taking Input.... Writing common code once
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name ");  //taking name
		 name=sc.next();
		 System.out.println("Enter Age");   //taking Age
		 Age=sc.nextInt();
		 System.out.println("Enter Phone Number"); //taking phone number
		 Phone_number=sc.nextLong();
		 System.out.println("Enter Address"); //taking address
		 Address=sc.next();
		 System.out.println("Enter Salary"); //taking salary
		 Salary=sc.nextFloat();
		 sc.close();
	}
	
	
	
	
	
}
