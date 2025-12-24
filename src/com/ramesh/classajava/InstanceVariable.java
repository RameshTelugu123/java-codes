package com.ramesh.classajava;

public class InstanceVariable {
	int age=19;
	//it is instance variable we can create inside class and outside method
	//we can access or print it by creating object to the class
	
	

	public static void main(String[] args) {
//		System.out.println(age);// we get error
		InstanceVariable var= new InstanceVariable();
		System.out.println(var.age);

	}

}
