package com.wipro.prac;

import java.util.Arrays;

public class aaaa {
//	public static void num(int i) {
//		
//		int a=100;
//		int b=200;
//		 System.out.println("a:"+a+", b:"+b);
//		a=a+b;
//		b=a-b;
//		b=a-b;
//		
//		 System.out.println("a:"+a+", b:"+b);
		
	public static void main(String[] args) {
		String  sen="ramesh is a good boy acmesh";
		String a[]=sen.split(" ");
		String small="";
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length-1;j++) {
		if(a[i].length()>a[j].length()) {//ramesh>is
			
			String temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
		}
		}
		
	}
	for(String word : a) {
		System.out.println(word);
	}

	}	
		

}
