package com.StringProg;

public class Rev_Each_Word_From_Sentence {

	public static void main(String[] args) {
		String s="Khatham ta ta bye bye";
		String[] str = s.split(" ");
		
		for(String s1:str)
		{
			for(int i=s1.length()-1; i>=0; i--)
			{
				System.out.print(s1.charAt(i));
			}
			System.out.print(" ");
		}
	}
}
