package com.wipro.prac;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		if(num%4==0) {
		 if(num%100!=0) {
			System.out.println("leap year");
		}
		 }
		else if(num%400==0) {
					System.out.println("leap year");
				}else {
					System.out.println("not leap year");
				}
			
		
		

	}

}
