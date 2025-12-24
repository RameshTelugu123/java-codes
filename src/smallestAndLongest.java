
public class smallestAndLongest {

	public static void main(String[] args) {
		String[] a= {"ramesh","le","koti","ram"};
		int small=a[0].length();
		String smallest = a[0];
		String largest = a[0];
		int large=a[0].length();
		for(int i=0;i<=a.length-1;i++) {
			if(small>a[i].length()) {
				small=a[i].length();
				smallest=a[i];
				
			}else if(large<a[i].length()){
				large=a[i].length();
				largest=a[i];
			}
		}
		System.out.println("small is  "+smallest + " and length is "+small);
		System.out.println("large is  "+largest +" and length is "+large);
	}

}
