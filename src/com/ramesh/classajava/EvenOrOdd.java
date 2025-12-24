package com.ramesh.classajava;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter number");
		int num=scanner.nextInt();
		int number=num;
		num=num%2;
		
//		if(num%2==0) {
//		System.out.println(num+ " is even");
//	}else {
//		System.err.println(num+" is odd");
//	}
		switch(num){
		case 0:
			System.out.println(number+ " is even ");
			break;
		case 1:
			System.err.println(number+" is odd");
		}
	}
}
