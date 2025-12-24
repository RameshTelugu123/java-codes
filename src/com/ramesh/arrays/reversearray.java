package com.ramesh.arrays;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
		String[] arr= {"coffee","tea","lemon"};
		String arr1[]=new String[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			arr1[arr.length-1-i]=arr[i];//2-1-1=0//2-1-2
		}
		System.out.println(Arrays.toString(arr1));

	}

}
