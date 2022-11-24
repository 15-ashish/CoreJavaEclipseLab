package com.ques2;


public class Parent {

	
		void disp()
		{
			System.out.println("This is parent class");
		}
	 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				Parent p=new Parent();
				child c=new child();
				p.disp();
				c.disp();
				c.show();
				

	}

}
