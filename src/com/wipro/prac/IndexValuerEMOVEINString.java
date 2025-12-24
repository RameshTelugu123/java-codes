package com.wipro.prac;

public class IndexValuerEMOVEINString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ramesh";
		int n=2;
		
			  String fst="";
			  String lst="";
			  if(str.length()>=0){
			    fst=str.substring(0,n);
			    lst=str.substring(n+1,str.length());
			  }
System.out.println(fst+lst);
	}

}
