
package com.StringProg;

public class Rev_Character_WithoutUsingLengthMethod {

	public static void main(String[] args) {
		String s="TestYantra";
		char[] ch=s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		System.out.println("Length is:"+count);
		for(int i=count-1; i>=0; i--)
		{
			System.out.print(s.toLowerCase().charAt(i));
		}

	}

}
