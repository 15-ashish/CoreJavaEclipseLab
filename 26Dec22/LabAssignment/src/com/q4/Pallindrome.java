//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment



package com.q4;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            int nos,temp,sum=0;
            System.out.println("Enter Number ");
            nos=sc.nextInt();
            temp=nos;
            
            while(temp!=0)
            {
            	sum=(sum*10)+temp%10;
            	temp=temp/10;
            }
            if(nos==sum)
                System.out.println("Pallindrome Number" );
            else
            	 System.out.println("Not a Pallindrome Number ");
	}

}
