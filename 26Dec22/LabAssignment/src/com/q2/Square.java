//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment
package com.q2;

import java.util.Scanner;

public class Square extends Rectangle
{
         float x,y,z;
	Square(float l, float b,float x) //child class constructor
	{
		super(l, b);//calling base class constructor
		y=x*x;
		z=4*x;
		System.out.println("Area of Square "+y); //area of square
		System.out.println("Perimeter of Square "+z);//perimeter of square
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float l,b,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length "); //Taking input length and breadth
		l=sc.nextFloat();
		System.out.println("enter breadth");
		b=sc.nextFloat();
		System.out.println("enter side of Square ");
		x=sc.nextFloat();
		Square obj=new Square(l,b,x);  //calling Parameterized constructor
		
		System.out.println("Area of rectangle :" +obj.area()); //printing area
		System.out.println("Perimeter of rectangle :" +obj.perineter()); //printing perimeter
		
		sc.close();
	
	}
	
		
		
	}

