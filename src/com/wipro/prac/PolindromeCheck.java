package com.wipro.prac;

public class PolindromeCheck {

	public static void main(String[] args) {
//		int num=1210;
//		int temp=num;
//		int rev=0;
//		while(num>0) {
//			int a=num%10;
//			rev=rev*10+a;
//			num=num/10;
//		}
//if(temp==rev) {
//	System.out.println("palindrome");
//}else {
//	System.out.println("not palindrome");
//}
		
		String a="rar";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
