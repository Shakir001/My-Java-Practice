package com.ArrayProg;

public class BubbleShotAscending {

	public static void main(String[] args) {
		int[] a= {5,6,2,8};
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
//		System.out.println(a[a.length-1]);
//		System.out.println(a[0]);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");

//		for (int i : a) {
//			System.out.println(i);
//		}
	}

	}
}

