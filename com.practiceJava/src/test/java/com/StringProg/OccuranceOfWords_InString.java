package com.StringProg;

public class OccuranceOfWords_InString {

	public static void main(String[] args) {
		String s="TestYantra";
		for(int i=0; i<s.length(); i++)
		{
			char ch1=s.toLowerCase().charAt(i);
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				char ch2=s.toLowerCase().charAt(j);
				if(ch1==ch2 && i>j)
				{
					break;
				}
				else if(ch1==ch2)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(ch1+" present "+count+" times");
			}
		}
	}

}
