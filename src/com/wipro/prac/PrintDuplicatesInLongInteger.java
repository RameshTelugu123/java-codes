package com.wipro.prac;

import java.util.Arrays;

public class PrintDuplicatesInLongInteger {

	public static void main(String[] args) {
		
		

		    Integer c[] = {1,3,4,5,5,8,8,9,-1,-1,-10,-10,9,9,8};
//		    Arrays.sort(a);
		    System.out.println(Arrays.toString(c));

		    int lastdup = 1;
//		    int ncount=0;
//
//		    for (int i = 0; i < a.length - 1; i++) {
//
//		        if (a[i] == a[i + 1] && !a[i].equals(lastdup)) {
//
//		            lastdup = a[i];
//
//		            int count = 0;
//		           
//		            for (int j = 0; j < a.length; j++) {
//		               if(a[i]==a[j]) {
//		            	 	count++;
//		               }
//		           
//		            }
//
//		            System.out.println(lastdup + " = " + count);
//		            System.out.println(lastdup + " = " + ncount);
//		        }
//		    }

//		    System.out.println();
		

		
		
		
		// TODO Auto-generated method stub
//		 Integer a = 233221444;
//	        char[] c = Integer.toString(a).toCharArray();
//	        Arrays.sort(c);
//	        int dup=1;
//	        System.out.println(Arrays.toString(c));
//	        for(int i=0;i<c.length-1;i++) {
//	        	int count=1;
//	        	if(c[i]==c[i+1]) {
//	        		if(!(c[i]==(dup))) {
//	        			count++;
//	        		}
//	        			dup=c[i];
//	        			System.out.println(dup + " = " + count);
//	        			
//	        		
//	        		
//	        	}
//	        }
	        
	        
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

	}

}
