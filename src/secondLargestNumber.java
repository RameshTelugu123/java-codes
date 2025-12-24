import java.util.Arrays;
import java.util.stream.Gatherer.Integrator;

public class secondLargestNumber {

	public static void main(String[] args) {
		int[] arr={976,-2,83,3,4,4,5,45,5,5,5,6,6,6,7,8,8,16,-2,300,500};
//		Arrays.sort(arr);
//		if(arr[arr.length-1]!=arr[arr.length-2]) {
//			System.out.println(arr[arr.length-2]);
//		}else {
//			System.out.println(arr[arr.length-3]);
//		}
		int secmax=Integer.MIN_VALUE;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
			}else if(arr[i]>secmax&& arr[i]!=max) {
				secmax= arr[i];
			}
		}
		System.out.println("secmax  is "+secmax);
System.out.println("max is "+max);
	}

}
