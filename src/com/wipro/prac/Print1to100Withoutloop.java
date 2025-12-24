package com.wipro.prac;

public class Print1to100Withoutloop {
	public static void  print(int i) {
		if(i>100) {
			return;
		}System.out.print(i+" ");
		print(i+1);
	}

	public static void main(String[] args) {
		print(1);
		
	}

}
