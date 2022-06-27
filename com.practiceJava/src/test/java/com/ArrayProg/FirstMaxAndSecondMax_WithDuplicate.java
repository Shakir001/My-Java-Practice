package com.ArrayProg;

public class FirstMaxAndSecondMax_WithDuplicate {

	public static void main(String[] args) {
		int[] a= {9,6,1,8,4,8,8};
		int fMax=0;
		int sMax=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>fMax)
			{
				sMax=fMax;
				fMax=a[i];
			}
			else if(a[i]>sMax && a[i]!=fMax)
			{
				sMax=a[i];
			}
		}
		System.out.println("This is first max no:"+fMax+"\n"+"This is second max no:"+sMax);
	}

}


