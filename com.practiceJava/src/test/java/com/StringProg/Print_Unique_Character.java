package com.StringProg;

import java.util.LinkedHashSet;

public class Print_Unique_Character {

	public static void main(String[] args) {
		String s="Khatham ta ta bye bye";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		for(Character ch:lhs)
		{
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(ch.equals(s.charAt(j)))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(ch+" present"+count+" times");
			}
		}

	}

}
