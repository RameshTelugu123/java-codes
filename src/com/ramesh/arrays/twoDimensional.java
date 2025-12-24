package com.ramesh.arrays;

import java.util.Arrays;

public class twoDimensional {
	String arr="ramesh";
	

	public static void main(String[] args) {
		int a=10;
		int [][] arr= {{1,2},{3,4},{5,6}};
		for(int i=0;i<=arr.length-1;i++) {
//			int[] singleRow=arr[i];
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		

	}

}
