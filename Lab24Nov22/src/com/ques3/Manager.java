package com.ques3;

public class Manager extends Member
{
	String Department;
	Manager()
	{
		Department=null;
	}
	
	void indataMan()
	{
		inData();
		System.out.println("Enter Department ");
		Department=sc.next();
		showdataMan();
		print_salary();
	}
	void showdataMan()
	{
		showData();
		System.out.println("Department "+Department);
	}

}
