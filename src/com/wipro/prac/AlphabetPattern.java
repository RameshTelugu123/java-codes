package com.wipro.prac;

public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<=n;i++) {
			for(char c='a';c<='a'+i;c++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
