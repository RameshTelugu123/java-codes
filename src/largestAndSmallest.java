
public class largestAndSmallest {

	public static void main(String[] args) {
		int[] arr = {12, 5, 7, 25, 3};
int min=arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		min=arr[i];
	}else if(arr[i]<max) {
		max=arr[i];
	}
}
System.out.println("max is "+max);
System.out.println("min is "+min);
	}

}
