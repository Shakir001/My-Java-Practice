package com.practice;

public class Test111 {
	public void m1(int x) {
		System.out.println("method1");
	}
	public void m1(String s) {
		System.out.println("method2");
	}
	public void m1(int x, int y) {
		System.out.println("method3");
	}
	public static void main(String[] args) {
		Test111 t=new Test111();
		t.m1(10);
		t.m1("shakir");
		t.m1(5,6);
		
	}
}
class Demo555{
	public void m1(int x) {
		System.out.println("new method1");
	}
	public static void main(String[] args) {
		
	}
}
