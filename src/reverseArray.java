import java.util.Arrays;

public class reverseArray {
	static int rev[];
	public static void main(String[] args) {
		int[] arr = {12, 5, 7, 25, 3};
		 rev=new int [arr.length];
//		 int index=0;
		 int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			
			rev[j]=arr[i];
			j++;
		}
System.out.println(Arrays.toString(rev));
	}

}
