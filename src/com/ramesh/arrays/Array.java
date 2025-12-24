package com.ramesh.arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
//		int a[]= {1,2,3,4,9};
//		int sum=0;
//		int avg=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//			avg=sum/a.length;
//		}
//System.out.println("sum of all numbers is "+sum);
//System.out.println("average is "+avg);
		
		//merge two array into one array
		
		/*String arr1[]= {"coffe","tea"};
		String arr2[]= {"milk","boost"};
		String arr3[] = new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(arr3));*/
		
		//find max number of array and its index
		
		/*int arr[]= {1,3,7,18,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println( arr.length-1+ " is index of number");
		System.out.println( arr[arr.length-1]+ " is index of number");*/
		
		//findsmallest word and print its index number
		/*String[] arr= {"coffee","tea","milk"};
		String max=arr[0];
		String min=arr[0];
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i].length()>arr[j].length()) {//coffe <tea false
				min=arr[j];
			}else {
				max=arr[j];
			}
			
			
		}}
		System.out.println(min);
		System.out.println(max);*/
	
		//reverse array and print
		
//		
//		i = 2
//				arr.length = 3
//
//				arr1[arr.length - 1 - i]
//				= arr1[3 - 1 - 2]
//				= arr1[0]

		String[] arr= {"coffee","tea","milk"};
		String [] arr1=new String[arr.length];
//		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
//			arr1[j]=arr[i];
//			j++;
			
			arr1[arr.length-1-i]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}

}
