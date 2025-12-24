package com.wipro.prac;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=1234;
		int rev=0;
		while(number>0) {
			int a=number%10;
			rev=rev*10+a;
			number=number/10;
			
		}
		System.out.println(rev);
	}

}
