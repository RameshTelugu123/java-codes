package com.wipro.prac;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=10001;int b=341111;int c=198;
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		if(max>c) {
			max=max;
		}else {
			max=c;
		}
		System.out.println(max);
	}

}
