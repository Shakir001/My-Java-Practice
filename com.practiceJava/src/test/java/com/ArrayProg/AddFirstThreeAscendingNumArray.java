package com.ArrayProg;

public class AddFirstThreeAscendingNumArray {

	public static void main(String[] args) {
		
		int[] a= {5,6,2,8,7,9,12,1};
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
		int sum=0;
		for(int i=0; i<3; i++) 
		{
			sum=sum+a[i];
		}
		System.out.print(sum);
	//	System.out.println(a[a.length-1]);
	}

}
