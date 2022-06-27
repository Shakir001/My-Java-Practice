package com.StringProg;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class IndexOfString {

	public static void main(String[] args) {
		String s="testyantra";
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			hs.add(s.charAt(i));
	//		System.out.println(hs);
		}
		for(Character ch:hs)
		{
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(ch.equals(s.charAt(j)))
				{
					count++;
				}
			}
	//		if(count>0)
			if(ch=='r')                      // to get particular index number
			{
				System.out.print(s.indexOf(ch));
			}
		}
	}
}
