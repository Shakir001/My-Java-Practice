package com.StringProg;

public class Test {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {9,9,9};
		int que=0;
		int rem=0;
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum=a[i]+b[i];
			if(sum>9)
			{
				while(sum!=1)
				{
					rem=sum%10;
					que=sum/10;
					sum=sum/10;
					System.out.print(que+" "+rem+" ");
				}
			}
		}
	}

}
