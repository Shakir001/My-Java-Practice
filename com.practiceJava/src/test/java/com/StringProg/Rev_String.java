package com.StringProg;

public class Rev_String {

	public static void main(String[] args) {
		String s="TestYantra";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.toLowerCase().charAt(i);
		}
		System.out.println(rev);
		
	}

}
