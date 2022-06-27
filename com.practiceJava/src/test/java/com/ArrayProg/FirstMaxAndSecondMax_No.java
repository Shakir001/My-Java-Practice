package com.ArrayProg;

public class FirstMaxAndSecondMax_No {

	public static void main(String[] args) {
		int[] a= {2,4,1,6,8};
		int fMax=a[0];
		int sMax=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>fMax)
			{
				sMax=fMax;
				fMax=a[i];
			}
			else if(a[i]>sMax)
			{
				sMax=a[i];
			}
		}
	//	System.out.println("This is first max no:"+fMax+"\n"+"This is second max no:"+sMax);
		System.out.println(fMax+"\n"+sMax);
	}

}
