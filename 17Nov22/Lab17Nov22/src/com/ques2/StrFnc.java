//Ashish Sahay
//17/11/2022


package com.ques2;

import java.util.Scanner;

public class StrFnc {
	
	public static void input(String str1,String str2)
	{
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.length());
		System.out.println(str2.substring(3, 7));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		String s1=new String();
		String s2= new String();
        System.out.println("Enter Srings");
        s1=sc.nextLine();
        s2=sc.nextLine();
        sc.close();
		
		
		input(s1,s2);
	}

}
