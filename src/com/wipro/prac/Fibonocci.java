package com.wipro.prac;

public class Fibonocci {

	public static void main(String[] args) {
		int num=5;
		int a=0;
		int b=1;
		for(int i=0;i<=num;i++) {
			System.out.print(a);
			if(i<num) {
				System.out.print(",");
			}
//			int temp=a+b;
//			a=b;
//			b=temp;
			b = a + b;   // new Fibonacci term
			a = b - a;
			
		}

	}

}
