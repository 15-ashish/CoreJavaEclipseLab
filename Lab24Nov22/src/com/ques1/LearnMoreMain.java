package com.ques1;
import java.util.Scanner;



public class LearnMoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);   
		Student s=new Student();
           Employee e=new Employee();  
           System.out.println("Whose Reocord your want to eneter \n 1. Student \n 2. Employee2 ");
           int a=sc.nextInt();
           switch(a)
           {
           case 1:
        	    s.inData();
        	  break;
           case 2:
        	   e.inData();
        	   break;
           }
           
	}

}
