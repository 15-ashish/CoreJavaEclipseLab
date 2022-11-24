package com.ques1;
import java.util.Scanner;
public abstract class NameAge {
	Scanner sc=new Scanner(System.in);

	 String firstName,lastName;
	  int age;
	  void NameAgeInput() {
		  System.out.println("Enter First Name"); 
		  firstName=sc.next();
		  System.out.println("Enter Last Name");
		  lastName=sc.next();
		  System.out.println("Enter Age ");
		  age=sc.nextInt();

}
}