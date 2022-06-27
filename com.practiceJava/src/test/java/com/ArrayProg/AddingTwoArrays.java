package com.ArrayProg;

public class AddingTwoArrays {

	public static void main(String[] args) {
		int[] a= {2,4,4,3,1,7};
		int[] b= {1,5,7,3};    
		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0; i<count; i++)
		{
			try {
			System.out.print(a[i]+b[i]+"  ");
			} 
			catch (Exception e) {
				if(a.length>b.length) {
					System.out.print(a[i]+"  ");
				}else {
					System.out.print(b[i]+"  ");
				}
	        }
		}	
   }
}