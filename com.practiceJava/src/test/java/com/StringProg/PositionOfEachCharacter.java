package com.StringProg;

import java.util.LinkedHashSet;

public class PositionOfEachCharacter {

	public static void main(String[] args) {
		String s="Tester";
		s=s.toLowerCase();
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		for(Character ch:lhs)
		{
			for(int j=2; j<s.length(); j++)
			{
				if(ch.equals(s.charAt(j)))
				{
					System.out.println(ch+"="+(j+1));
				}
			}
		}

	}

}
