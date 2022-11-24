package com.ques1;
import java.util.Scanner;
public class Student extends NameAge
{
	Scanner sc=new Scanner(System.in);
	String course;
	  int Student_ID;
	  public void inData()
	  {
		  NameAgeInput();
		  System.out.println("Enter Course ");
		  course=sc.next();
		  System.out.println("Enter Student ID"); 
		  Student_ID=sc.nextInt();
		  System.out.println("Student Record Updated ");
		 
	  
	  }
}
	
	

