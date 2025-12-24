package com.wipro.prac;

public class primenumbercheck {
	
	
	
	public static void main(String[] args) {
		boolean isPrime=true;
		int  number =19;
		if(number<=0) {
		
			isPrime =false;
		}else {
			for(int i=2;i<=number/2;i++) {
				if(number%i==0) {
					isPrime= false;
					break;
				}
			
			}}
		if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

	}

}
