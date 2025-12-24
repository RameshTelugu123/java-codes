package com.wipro.prac;

import java.util.Arrays;

public class javaprep {

	public static void main(String[] args) {
		
		int arr[]= {-19999,3000,1,1,2,2,19,222,-10,-99,999};
		int max=arr[0];
		int secmax=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]>max) {
			secmax=max;
			max=arr[i];
		}
		else if(arr[i]>secmax && arr[i]!=max) {
			secmax=arr [i];
		}
		}
		System.out.println(secmax);
		}
}

