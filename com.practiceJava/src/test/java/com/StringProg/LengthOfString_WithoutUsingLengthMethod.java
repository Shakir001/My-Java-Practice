package com.StringProg;

public class LengthOfString_WithoutUsingLengthMethod {

	public static void main(String[] args) {
		String s="TestYantra";
		char[] ch=s.toCharArray();
		int count=0;
		for(char i:ch)
		{
			count++;
		}
		System.out.println("length is: "+count);
		
//		System.out.println(s.length());
	}

}
