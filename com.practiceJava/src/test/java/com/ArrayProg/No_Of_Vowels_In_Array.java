package com.ArrayProg;

import java.util.LinkedHashSet;

public class No_Of_Vowels_In_Array {

	public static void main(String[] args) {
		String[] s= {"hi","helloo","india"};
		
		for(int i=0; i<s.length; i++)
		{
			String s1=s[i];
			int count=0;
			LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
			for(int j=0; j<s1.length(); j++)
			{
				lhs.add(s1.charAt(j));
			}
			for(Character ch:lhs)
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
			System.out.println(s1+"-->No. of vowels="+count);
		}

	}
	
	

}
