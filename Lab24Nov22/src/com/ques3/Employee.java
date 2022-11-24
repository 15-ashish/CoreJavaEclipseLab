package com.ques3;

import java.util.Scanner;

public class Employee extends Member
{
	String specialization;
	Employee()
	{
		specialization=null;
	}
	
	
	void indataEmp()
	{
		Scanner sc=new Scanner(System.in);
		inData();
		System.out.println("Enter Specialization ");
		specialization=sc.next();
		showdataEmp();
		print_salary();
		sc.close();
	}
	void showdataEmp()
	{
		showData();
		System.out.println("Specialozation "+specialization);
		
	}


	
	

	
}
