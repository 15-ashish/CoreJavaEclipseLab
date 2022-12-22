//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment


package com.q1;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
      Employee e=new Employee();
      Manager m=new Manager();
      Scanner sc =new Scanner(System.in);
    		
      System.out.println("Whose Details \n 1. Employee \n 2.Manager \n");//Asking for choice
      a=sc.nextInt();
      switch(a) //going to specific choice
      {
      case 1: e.input_emp();
              e.output_emp();
              break;
      case 2: m.input_manager();
              m.out_manager();
              break;
      default: System.out.print("Invalid Choice");
		
      }
      sc.close();
		
	}
}

