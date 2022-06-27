package com.StringProg;

public class Rev_Character_Using2ndVariable_withoutUsingLengthMethod {

	public static void main(String[] args) {
		String s="TestYantra";
		char[] ch=s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		System.out.println("Length is:"+count);
		
		String rev="";
		for(int i=count-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
	//		System.out.print(s.toLowerCase().charAt(i));
		}
		System.out.println(rev);
	}

}
