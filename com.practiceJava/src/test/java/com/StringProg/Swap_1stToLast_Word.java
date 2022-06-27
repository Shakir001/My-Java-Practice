package com.StringProg;

public class Swap_1stToLast_Word {

	public static void main(String[] args) {
		String s="Khatham ta ta bye bye";

		String[] str = s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		//		for(String s1:str)
		//		{
		//			System.out.print(s1+" ");
		//		}

		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i]+" ");
		}
	}

}
