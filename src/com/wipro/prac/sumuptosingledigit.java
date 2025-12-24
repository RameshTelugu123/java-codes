package com.wipro.prac;

public class sumuptosingledigit {

	public static void main(String[] args) {
		int a=879;
		int sum=0;
		int rem=0;
		int c=0;
		while(a>0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;	
		}
		if(sum>9) {
			c=sum%10;
			sum=sum/10;
			sum=sum+c;
			
		}
		System.out.println(sum);
	}

}
