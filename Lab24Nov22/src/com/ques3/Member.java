package com.ques3;

import java.util.Scanner;

public class Member 
{
	Scanner sc=new Scanner(System.in);
	String Name,Address;
	int age,phone_number;
	float salary;
    void print_salary() {System.out.println("Salary : " +salary);}
    Member()
    {
    	Name=Address=null;
    	age=phone_number=0;
    	salary=0.0f;
    }
    
    
   public void inData()
    {
    	System.out.println("Enter Name : ");
    	Name=sc.next();
    	System.out.println("Enter Address : ");
    	Address=sc.next();
    	System.out.println("Enter Age : ");
    	age=sc.nextInt();
    	System.out.println("Enter Salary : ");
    	salary=sc.nextFloat();
        System.out.println("Enter Phone Number : ");
        phone_number=sc.nextInt();
    }
   
   public void showData()
    {
    	System.out.println("Name : "+Name);
    	System.out.println("Address : "+Address);
    	System.out.println("Age : "+age);
       	
        System.out.println("Phone Number: "+phone_number);
        
    }
    
    
}
