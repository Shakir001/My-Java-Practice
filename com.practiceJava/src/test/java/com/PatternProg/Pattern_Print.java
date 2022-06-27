package com.PatternProg;

public class Pattern_Print {

	public static void main(String[] args) {                //1
		int row=5;                                          //23
		int count=1;                                        //456 
		int num=1;                                          //7891
		for(int i=1; i<=row; i++)                           //23456
		{
			for(int j=1; j<=count; j++)
			{
				if(num>9)
				{
					num=1;
				}
				System.out.print(num);
				num++;
			}
			System.out.println();
			count++;
			
		}
		
	}

}
