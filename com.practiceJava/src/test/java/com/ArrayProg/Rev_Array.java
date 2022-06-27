package com.ArrayProg;

public class Rev_Array {

	public static void main(String[] args) {
		int[] a= {5,4,9,2,6};
		int[] revarr=new int[a.length];
		int count=0;
		for(int i=a.length-1; i>=0; i--)
		{
			revarr[count++]=a[i];
		}
		System.out.println("Length of array:"+count);
		for (int i : revarr) {
			System.out.print(i+" ");
		}
		
	//	-----------Using Length------------------------------------------------	
//		int count=0;
//		for(int i=a.length-1; i>=0; i--)
//		{
//			System.out.print(a[i]+" ");
//			count++;
//		}
//		System.out.println();
//		System.out.println("Length of array: "+count);	
		
	}
}






