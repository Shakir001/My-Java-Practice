package com.practice;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.test();
		
		B obj1=obj;
		obj1.test();
		
		A obj2=obj1;
		obj2.test();
		
		B obj3=(B)obj2;
		obj3.test();
		
		A obj4=(A)obj3;
		obj4.test();
	}

}
