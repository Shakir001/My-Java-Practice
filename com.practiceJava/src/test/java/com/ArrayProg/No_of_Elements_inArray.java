package com.ArrayProg;

public class No_of_Elements_inArray {

	public static void main(String[] args) {
		int[] a= {2,5,6,8,2};
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j] & i>j)
				{
					break;
				}
				else if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(a[i]+"-"+count+"times");
			}
		}

	}

}

