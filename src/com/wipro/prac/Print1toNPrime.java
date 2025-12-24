package com.wipro.prac;

public class Print1toNPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=111;
		
			for(int i=2;i<=num;i++) {
				boolean isPrime=true;
				for(int j=2;j<=i/2;j++)//j<=i,j<=math.sqrt(i)
				if(i%j==0) {
					isPrime=false;
					
					
				}
				if(isPrime)
				System.out.print(i +" ");
			}
			System.out.println();
	System.out.print("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109");
		}

	}


