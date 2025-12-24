package com.wipro.prac;


import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,1,3,4,5,5,8,8,9,-1,-1,-10,-10};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int lastdup=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]&& !(a[i]==(lastdup))) {
				lastdup=a[i];
				System.out.println(lastdup);
			}
		}
		System.out.println();

	}
	
	
	
//	static int a[]= {-1,-1,-3,-3,1,1,2,2,3,4,5,6,6,77,77,8,9,-3,-3,77,1,1,1,1};
//	static int dup=0;
//	public static void main(String[] args) {
//		Arrays.sort(a);
//		ArrayList<Integer> duplicates = new ArrayList<>();
//		for(int i=0;i<a.length-1;i++) {
//			
//			if(a[i]==a[i+1]&&(a[i]!=dup)) {
//				duplicates.add(a[i]);
//				dup=a[i];
//				
//				
//			}
//			
//		}
//		System.out.println(duplicates);
//	}


}
