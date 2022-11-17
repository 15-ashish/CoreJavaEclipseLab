//Ashish Sahay
//17/11/2022


package com.ques3;

import java.util.Scanner;
class MyException extends Exception
{
 
	MyException(String msg)
 {
	 super(msg);
 }
}

public class GameMenu {
	
	static void menu()
	{
		System.out.println("1.New Player");
		System.out.println("2. View Record");
		System.out.println("3.Change Appearences");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
		    int ch;
            System.out.println("Enter option");
            menu();
            try
            {
            ch=sc.nextInt();
            if(ch>3)
            {
            	throw new MyException("Enter valid Choice");
            }
            
            }catch(MyException e)
            {
            	System.out.println(e.getMessage());
            }
           
            sc.close();
	}

}
