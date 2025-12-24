package com.wipro.prac;

public class LargestAndSmallestNum {

	public static void main(String[] args) {
		int a[]= {-8,1,2,3,9,11,100,1096,-99};
		int min=a[0];
		int max=a[0];
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		if(a[i]<min) {
			min=a[i];
		}
	}
System.out.println("max="+max+" min="+min);
	}

}
