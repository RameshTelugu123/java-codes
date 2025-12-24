package com.ramesh.classajava;

public  class classcreate {
	
	//varaible
	public String name="ramesh";
	public int age=25;
	public String job="automation tester";
	public static  void ramesh() {
		System.out.println("ramesh hi");
	}

	//methods //n number of methods we  create in class
	public static void main(String[] args) {
		int code=10;
		code=11;
		System.out.println(code);
		 
		classcreate cl= new classcreate();
		cl.ramesh();
	}

}
