package com.wipro.prac;

import java.util.Arrays;

public class ReverseWordsWithoutSplit {

	public static void main(String[] args) {
//		String sen="ramesh is a good boy";
//		String a[]=sen.split(" ");
//		String rev="";
//		char c[]=sen.toCharArray();
//		String word="";
//		for(int i=c.length-1;i>=0;i--) {
//			if(c[i]!=' ') {
//				word=c[i]+word;//y+"";//oy//boy//
//			}else {
//			rev=rev+word+" ";//""+boy//
//			word="";
//			}
//		}
//		rev=rev+word;
//		System.out.println(rev);
		
//		int num=100;
//		int count=0;
//		for(int i=0;i<=num;i++) {
//			if(i%10==7) {
//				System.out.println(i);
//				count++;
//			}
//		}
//		
//		
//		
//		System.out.println(count);
//		System.out.println();
//		
//		
		
		
//		String sen="ramesh is a good boy";
//		char c[]=sen.toCharArray();
//		String rev="";
//		for(int i=0;i<c.length;i++) {
//			if(c[i]!=' ') {
//				rev=rev+c[i];
//			}
//		}
//		
//		System.out.println(sen.replace(" ",""));
//		System.out.println(rev);
//		
		int arr[]= {1,667,23,44,555,667,667,-124};
		Arrays.sort(arr);
		
		
//		System.out.println(arr[arr.length-2]);
		for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]!=arr[i-1]) {
			System.out.println(arr[i-1]);
			break;
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
