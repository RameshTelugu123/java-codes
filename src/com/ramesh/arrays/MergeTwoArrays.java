package com.ramesh.arrays;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		String arr1[]= {"coffee","tea","milk"};
		String arr2[]= {"drink","chai"};
		String arr3[]=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			arr3[arr3.length-1]=arr2[j];
		}
System.out.println(Arrays.toString(arr3));
	}

}
