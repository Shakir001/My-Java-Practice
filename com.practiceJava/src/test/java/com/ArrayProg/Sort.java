package com.ArrayProg;

public class Sort {

	public static void main(String[] args) {
		int[] a= {1,0,0,1,0,1,1,0,3,5,3,5,6,1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
//		for (int i : a) {
//			System.out.print(i+" ");
//		}
	}

}
