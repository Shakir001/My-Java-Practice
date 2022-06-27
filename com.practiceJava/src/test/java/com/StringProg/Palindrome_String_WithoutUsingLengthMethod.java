package com.StringProg;

public class Palindrome_String_WithoutUsingLengthMethod {

	public static void main(String[] args) {
		String s="Madam";
		char[] ch=s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
	//	System.out.println("Length is:"+count);
		
		String rev="";
		for(int i=count-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
	//		System.out.print(s.toLowerCase().charAt(i));
		}
		System.out.println("Reverse is: "+rev);
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println(rev+" is palindrome");
		}else {
			System.out.println(rev+" is not palindrome");
		}

	}

}
