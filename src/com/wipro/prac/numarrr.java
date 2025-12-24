package com.wipro.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class numarrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int Arr[]= {1,5,12,13};
//		Arrays.sort(Arr);
//		System.out.println(Arrays.toString(Arr));
//		System.out.println(Arr[Arr.length-1]);
		
//String ar="ramesh";
//int vcount=0;
//int ccount=0;
//char[] c=ar.toCharArray();
//for(int i=0;i<=c.length-1;i++) {
//	if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
//		vcount++;
//	}else {
//		ccount++;
//	}
//
//}
//System.out.println("vcount= "+vcount+"   ccount = "+ccount);
		
//		int a=87612222;
//		int sum=0;
//		int rem=0;
//		int c=0;
//		while(a>0) {
//			rem=a%10;
//			sum=sum+rem;
//			a=a/10;	
//		}
//		if(sum>9) {
//			c=sum%10;
//	     	sum=sum/10;
//			sum=sum+c;
//			
//		}
//		System.out.println(sum);
//		
		
//		int aa = 233221444;
//		char[] c1 = Integer.toString(aa).toCharArray();
//        int  dup=1;
//		for (int i = 0; i < c1.length; i++) {
//		    int count = 1;
//
//		    for (int j = i + 1; j < c1.length; j++) {
//		        if ((c1[i] == c1[j])&&dup!=c1[i]) {
//		        
//		            count++;
//		        }
//		    }
//		        if (dup!=c1[i]&&count > 1) {
//			        System.out.println(c1[i] + " = " + count);
//			    	dup=c1[i];
//			    }
//		    }
		
		
		 int a = 233221444;
	        char[] c = Integer.toString(a).toCharArray();
	        boolean[] isVisited = new boolean[c.length]; // initialize visited array

	        for (int i = 0; i < c.length; i++) {
	            if (isVisited[i]) continue; // skip already counted digits

	            int count = 1;
	            for (int j = i + 1; j < c.length; j++) {
	                if (c[i] == c[j]) {
	                    count++;
	                    isVisited[j] = true; // mark duplicate as visited
	                }
	            }

	            if (count > 1) {
	                System.out.println(c[i] + " = " + count);
	            }
	        }
		
//		integer print like array
//		public static void main(String[] args) {
//			int num=1233455667;
//			char[] c=Integer.toString(num).toCharArray();
//			System.out.println(Arrays.toString(c));
//		
		
//		}

	
}

}
