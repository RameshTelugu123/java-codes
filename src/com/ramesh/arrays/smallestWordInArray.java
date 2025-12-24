package com.ramesh.arrays;

public class smallestWordInArray {

	public static void main(String[] args) {
String arr[]= {"d","coffee","tea","boost","milk","ce"};
String min = arr[0];
String max=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i].length()<min.length()) {
		min=arr[i];
	}else if(arr[i].length()>max.length()) {
		max=arr[i];
	}
}
System.out.println("min word is "+min);
System.out.println("max word is "+max);
	}

}
