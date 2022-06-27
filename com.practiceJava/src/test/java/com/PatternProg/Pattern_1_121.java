package com.PatternProg;

public class Pattern_1_121 {

	public static void main(String[] args) {                                 

		int row=5;
		int count=1;
		int space=4;

		for(int i=1; i<=row; i++)
		{
			int num=1;
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=count; k++)
			{
				System.out.print(num);
				num++;
			}
			num-=2;
			for(int l=1; l<count; l++)
			{
				System.out.print(num);
				num--;
			}
			System.out.println();
			count++;
			space--;
		}
	}
}
