//Ashish Sahay
//Date : 26/12/2022
//Lab Assignment
package com.q2;



public class Rectangle {
	
      float length;   
      float breadth;
	  float area()  
	  {
		float a=length*breadth;   //calculating area of  a rectangle
		  return a;
	  }
	  float perineter()
	  {
		  float p=(2*(length+breadth));//calculating perimeter of rectangle
		  return p;
	  }
	   Rectangle(float l,float b) //Parameterized constructor
	   {
		   length=l;
		   breadth=b;
	   }
	   

	
	}


