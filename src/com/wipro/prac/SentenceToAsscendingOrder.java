package com.wipro.prac;

public class SentenceToAsscendingOrder {

	public static void main(String[] args) {
	String sen="ramesh is a good boy dcfghs";
	String a[]= sen.split(" ");
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i].length()<a[j].length()) {
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(String word: a) {
		System.out.println(word);
	}
	}
}
