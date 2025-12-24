package com.ramesh.classajava;

import java.util.Scanner;

public class AssignmentOperation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("please enter first number");
		int num=sc.nextInt();
		System.out.println("please eneter second number");
		int num1=sc.nextInt();
		System.out.println("please enter operator");
		String numop=sc.next();// to pass =,-*,/,%
		switch(numop) {
		case "+":
			System.out.println("Result: " + (num + num1));
			break;
		case "-":
			System.out.println("Result: " + (num - num1));
			break;
		case "*":
			System.out.println("Result: " + (num * num1));
			break;
		case "/":
			System.out.println("Result: " + (num / num1));
			break;
		case "%":
			System.out.println("Result: " + (num % num1));
			break;
		default:
			System.out.println("Invalid operator entered");
		}


	}

}
