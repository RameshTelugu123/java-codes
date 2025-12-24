package com.ramesh.arrays;

import java.util.Arrays;

public class maxNumber {

	public static void main(String[] args) {
		int[] num= {1,4,5,68,9};
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		System.out.println(num[num.length-2]);
		
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			
				if(num[i]>=max) {
				max=num[i];
				
			}if(num[i]<min) {
				min=num[i];
			}
			
		}
		System.out.println("max number is "+max);
		System.out.println("min number is "+min);
	}

}
