package com.PatternProg;

public class Pattern_Diamond {
	public static void main(String[] args) {
		int row=5;
		int count=1;
		int space=2;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=count; k++)
			{
				System.out.print("*"+" ");
			}
			if(i<3) {
				count++;
				space--;
				
				
			}else {
				space++;
				count--;
			}
			System.out.println();
			
		}
	}
}
