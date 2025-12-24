package com.ramesh.classajava;

import java.util.Scanner;

public class weeksDay {

	public static void main(String[] args) {
		System.out.println("enter text:");
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine();//scanner class create new string object so we can not == to compare
		//		if(Day.equalsIgnoreCase("sunday")) {
		//			System.out.println("yayy it is sunday");
		//		}else if(Day.equalsIgnoreCase("monday")) {
		//			System.out.println("yayy it is monday");
		//
		//		}else if(Day.equalsIgnoreCase("tuesday")) {
		//			System.out.println("yayy it is tuesday");
		//
		//		}else if(Day.equalsIgnoreCase("wednesday")) {
		//			System.out.println("yayy it is wednesday");
		//
		//		}else if(Day.equals("thursday")) {
		//			System.out.println("yayy it is thursday");
		//
		//		}else if(Day=="friday") {
		//			System.out.println("yayy it is friday");
		//
		//		}else {
		//			System.err.println("Oops invalid input");
		//		}
		switch(Day) {
		case "sunday":
			System.out.println("yayy it is sunday");
			break;

		case "monday":
			System.out.println("yayy it is monday");
			break;
		case "tuesday":
			System.out.println("yayy it is tuesday");
			break;
		case "wednesday":
			System.out.println("yayy it is wednesday");
			break;
		case "thursday":
			System.out.println("yayy it is thursday");
			break;
		case "friday":
			System.out.println("yayy it is friday");
			break;
		case "saturday":
			System.out.println("yayy it is satyrday");
			break;
		default:
			System.out.println("invalid day");
		}
	}
}
