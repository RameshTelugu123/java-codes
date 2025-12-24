import java.util.Arrays;

public class duplicatesInArray {

	public static void main(String[] args) {
		int a[]= {-2,3,3,4,4,5,4,5,5,5,6,6,6,7,8,-2};
		Arrays.sort(a);
		int dup=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]&&dup!=a[i]) {
				
				dup=a[i];
				System.out.println(dup);
			}
			
		}
		System.out.println();
//		int[] arr = {-2,3,3,4,4,5,4,5,5,5,6,6,6,7,8,-2};
//		
//		for (int i = 0; i < arr.length; i++) {
//		    for (int j = i + 1; j < arr.length; j++) {
//		        if (arr[i] == arr[j]) {
//		            System.out.println("Duplicate: " + arr[i]);
//		        }
//		    }
//		}
//		
	}

}
