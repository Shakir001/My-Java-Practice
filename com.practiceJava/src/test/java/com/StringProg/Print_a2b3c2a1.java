package com.StringProg;

import java.util.LinkedHashSet;

public class Print_a2b3c2a1 {

	public static void main(String[] args) {
		String s="aabbbcca";
		
		for(int i=0; i<s.length(); i++)
		{
			int count=1;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
				}
				else
				{
					break;
				}
			}
			
			System.out.print(s.charAt(i)+""+count);
		}
	}
}
