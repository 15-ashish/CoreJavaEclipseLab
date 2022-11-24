package com.ques3;

import java.util.Scanner;

public class MainMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);  
		Employee e=new Employee();
           Manager m=new Manager();
           System.out.println("Enter Whose reord to add \n 1.Employee \n 2.Manager  ");
           int a=sc.nextInt();
           switch(a)
           {
           case 1: e.indataEmp();
           break;
           case 2:  m.indataMan();
        	   break;
        	   
           }
           
		
		
	}

}
