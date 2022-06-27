package com.practice;

public class Test1 {
	int x=10;
	static int y=20;
	public void test() {
		Test1 t=new Test1();
		System.out.println(x);
		System.out.println(t.x);
		System.out.println(this.x);
		
		System.out.println(y);
		System.out.println(t.y);
		System.out.println(this.y);
		System.out.println(Test1.y);
	}
	public static void testone() {
		Test1 t=new Test1();
		System.out.println(t.x);
		
		System.out.println(y);
		System.out.println(t.y);
	}
	
	
}
