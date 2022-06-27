package com.StringProg;

import java.util.LinkedHashSet;

public class Print_only_unique_words {

	public static void main(String[] args) {
		String s="Khatham ta ta bye bye";
		String[] str = s.split(" ");
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
				if(str2.equalsIgnoreCase(str[j]))
				{
		//			System.out.println(str2);
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(str2+" present "+count+" times");
			}
		}

	}

}
