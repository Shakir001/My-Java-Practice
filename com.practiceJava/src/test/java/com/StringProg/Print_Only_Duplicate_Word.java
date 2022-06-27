package com.StringProg;

import java.util.LinkedHashSet;

public class Print_Only_Duplicate_Word {

	public static void main(String[] args) {
		String s="Khatam ta ta bye bye";
		String[] str=s.split(" ");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			lhs.add(str[i]);
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
			if(count>1)
			{
				System.out.println(str2+" present "+count+" times");
			}
		}
	}
}
