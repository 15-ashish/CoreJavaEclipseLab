package com.ques1;
import java.util.Scanner;
public class Employee extends NameAge {
     Scanner sc=new Scanner(System.in);
	  float salary;
	  String DeptName,Designation;
	  int Emp_ID;
	 public void inData() 
	 {
		
		 NameAgeInput();
		 System.out.println("Enter Salary "); 
		 salary=sc.nextFloat();
		 System.out.println("Enter Department Name"); 
		 DeptName=sc.next();
		 System.out.println("Enter Designation");
		 Designation=sc.next();
		 System.out.println("Enter Employee ID ");
		 Emp_ID=sc.nextInt();
		 System.out.println("Employee Record Updated ");
		 
		
		
}


}