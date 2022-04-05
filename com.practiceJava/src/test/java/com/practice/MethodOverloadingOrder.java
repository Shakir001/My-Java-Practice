package com.practice;

public class MethodOverloadingOrder {
	public void m1(int x, String s) {
		System.out.println("m1 is running with int and string arg");
	}
	public void m1(String s, int y) {
		System.out.println("m1 is running with string and int arg");
	}
}
