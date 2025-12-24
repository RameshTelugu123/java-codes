package com.wipro.prac;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,3,578,-898,9,-1,1000};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,java.util.Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}

}
