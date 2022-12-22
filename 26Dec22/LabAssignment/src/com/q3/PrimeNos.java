//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment



package com.q3;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int nos,var,c=0;
         System.out.println("Enter Number ");
         nos=sc.nextInt();
         var=nos/2;
         if(nos==0||nos==1)
        	 System.out.println("Number is not a Prime Number "+nos);
         else
         {
         for(int i=2;i<nos;i++)
         {
             if(nos%2==0)
            	 {
            	 System.out.println("Number is not a Prime Number "+nos);
            	 c=1;
            	 break;
            	 }
         }
          if(c==0)     
        	  System.out.println("Number is  a Prime Number "+nos);
}
}
}