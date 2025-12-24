package com.ramesh.looping;
/**
 * this is the while loop
 */
public class whileLoop {

	public static void main(String[] args) {
		//print 1 to 100 
	/*	int num=1;
		while(num<=100) {
			System.out.println(num);
			num++;
		}
*/
		//even number from 200 to 500
		/*	int num=200;
		int count=0;
		while(num<=500) {
			if(num%2==0) {
				System.out.println(num+" is even number");
				count++;
			}
				
			num++;
		}
		System.out.println(count);*/
		
		//print 150 to 200 numbers which is divisble by 7
	/*	int num=150;
		while(num<=200) {
			if(num%7==0) {
				System.out.println(num+" is divisible by 7");
			}
			num++;
		}*/
		//print prime number from 50 to 100
		/*int num=50;
		while(num<=100) {
			boolean isPrime=true;
			if(num%2==0) {
				isPrime=false;
			}else {
				int i=2;
				while(i<=num/2) {
					if(num%i==0) {
						isPrime=false;
					}
					i++;
				}
				if(isPrime) {
					System.out.println(num+" is prime");
				}
			
			}
			num++;
		}
		*/
		
		//print of 40 to 80 
	/*	int num=40;
		int sum=0;
		while(num<=80) {
			if(num%2==0) {
				sum=sum+num;
				
			}
			num++;	
		}
	
		System.out.println(sum);*/
		//print odd number between 200 to 25
		/*int num=200;
		
		while(num>=25) {
			if(num%2!=0) {
				System.out.println(num);
			}
			num--;
		}*/
		int num=150;
		while(num<=200) {
			Boolean isPrime= true;
			if(num%2==0) {
				isPrime= false;
			}else {
			int i=2;
			while(i<=num/2) {
				if(num%i==0) {
					isPrime=false;
				}
				i++;
			}
			
	
		if(isPrime) {
			System.out.println(num);
		}}
			num++;
	}
		
		}

}
