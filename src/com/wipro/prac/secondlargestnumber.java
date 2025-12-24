package com.wipro.prac;
//
import java.util.Arrays;
//
public class secondlargestnumber {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online

		
//		       int a[]={1,2,3,55,4,6};
//		       int max =Integer.MIN_VALUE;
//		       int secmax=Integer.MIN_VALUE;
////		       Arrays.sort(a);
////		       System.out.println(Arrays.toString(a));
////		       System.out.println(a[a.length-2]);
//		       for(int num:a){
//		           if(num>max){
//		               secmax=max;
//		              max =num;
//		           }else if(num>secmax&&num!=max){
//		               secmax=num;
//		           }
//		       }
//		       System.out.println(secmax);
//		    }
		
		
//		
//
//}



    public static void main(String[] args) {
        int a[] = {1, 2, 3, 55, 4, 6};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        // Using traditional for loop
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secmax = max;
                max = a[i];
            } else if (a[i] > secmax && a[i] != max) {
                secmax = a[i];
            }
        }

        System.out.println("Second Maximum: " + secmax);
    }
}