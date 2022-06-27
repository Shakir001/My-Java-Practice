package com.StringProg;

import java.util.LinkedHashSet;

public class Print_Word_To_Word {

	public static void main(String[] args) {
		String s="Khatham ta ta bye bye";
		
		String[] str=s.split(" ");
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			lhs.add(str[i]);
//			System.out.println(hs);
		}
		for(String str2:lhs)
		{
			int count=0;
			for(int j=0; j<str.length; j++)
			{
				if(str2.equals(str[j]))
				{
					count++;
				}
			}
			if(count>0) {
			System.out.println(str2+" is present "+count+" times");
		}
//		for(int i=0; i<str.length; i++)
//		{
//			System.out.println(str[i]);
//		}
		}
	}

}
