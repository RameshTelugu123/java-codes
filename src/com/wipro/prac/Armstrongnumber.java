package com.wipro.prac;

public class Armstrongnumber {

	public static void main(String[] args) {

		int a=153;
		int temp=0;
		int org=a;
		while(a >0) {
			int num=a%10;
			temp=temp+(num*num*num);
			a=a/10;
			
		}
		if(temp==org) {
			System.out.println(temp+" is armstrong");
		}else {
			System.out.println(temp+ " is not armstrong");
		}
	}

}
