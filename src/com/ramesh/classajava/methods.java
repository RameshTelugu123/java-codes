package com.ramesh.classajava;

public class methods{
	static int balance =1000;
	
	public static void deposit(int amount) {
		balance=balance+amount;
	}
	public void withdrawal(int amount) {
		balance=balance-amount;
		
	}
	public static int getBalance() {
		return balance;//instead of void we have to declare datatype in the method then we can declare return type
		
	}

	public static void main(String[] args) {
		methods methodsClass= new methods();
		deposit(218);
		System.out.println(methods.balance);
		methodsClass.withdrawal(534);
		System.out.println(methods.balance);
	System.out.println(	getBalance());
		

	}

}
