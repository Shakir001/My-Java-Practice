package com.ArrayProg;

public class SwipeTwoVariable_withoutUsingThirdVariable {
	public static void main(String[] args) {
		int a=2;
		int b=4;
		a=a+b;
		b=a-b;
		a=a-b;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		System.out.println("a="+a+"\n"+"b="+b);
	}
}
