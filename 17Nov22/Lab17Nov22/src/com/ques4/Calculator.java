//Ashish Sahay
//17/11/2022



package com.ques4;
import java.lang.Exception;
import java.util.Scanner;

class MyException extends Exception
{
  MyException(String msg)
  {
	  super(msg);
	
  }
}

public class Calculator {
	 
	public static void calc(int ch,float n1,float n2)
	
	{
		switch(ch)
		{
		case 1:
			System.out.println("Addition ="+(n1+n2));
			break;
		case 2:
			System.out.println("Subtraction ="+(n1-n2));
			break;
		case 3:
			System.out.println("Multiplication ="+(n1*n2));
			break;
		case 4:
			
			System.out.println("Division ="+(n1/n2));
			break;
			
			
		default:
			System.out.println("Invalid Option");
		}
	}
	
	public static void menu()
	{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4.Division");
	}
		
	public static void input()
	{
		float num1,num2;
		char ch='y';
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			menu();
		System.out.println("...............Enter your choice..............");
		choice=sc.nextInt();
		
		System.out.println("Enter Two Numbers;");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		try {
		if(num1<=0 || num2<=0)
		 {
			throw new MyException("Number must be greater than 0");
		 }
		
		}catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
		
		calc(choice,num1,num2);
		System.out.println("want to continue press y or else press n");
		ch=sc.next().charAt(0);
		} while(ch=='y');
	
		sc.close();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();

	}

}
