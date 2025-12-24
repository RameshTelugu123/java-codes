package com.wipro.prac;

import java.util.Arrays;

public class javapractice {

	public static void main(String[] args) {
	int a[]= {5,5,2,7,8,26,30};
//	Arrays.sort(a);
//	System.out.println(a[a.length-2]);
	int max=Integer.MIN_VALUE;
	int secMax=Integer.MIN_VALUE;
	
	for(int num:a) {
		if( num>max) {
						secMax=max;
						max=num;

			
		}else if(num>secMax&&num!=max) {
			secMax=num;
		}
		
	}
	System.out.println(secMax);

	
}}
