package com.ramesh.classajava;

import java.util.Scanner;

public class passOrFail {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter marks");
	int marks=sc.nextInt();
	if(marks>85) {
		System.out.println("student got A grade = "+marks);
	}else if(marks>70&marks<=85) {
		System.out.println("student got B grade = "+marks);
	}else if(marks>35&marks<=70) {
		System.out.println("student got C grade = "+marks);
	}else {
		System.err.println("student got FAIL with "+marks);
	}
	}

}
