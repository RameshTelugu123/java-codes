import java.util.Arrays;

public class rightRotation {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int k=2;
		int temp[]=new int[k];
		int temp2[]=new int[a.length-k];
for(int i=0;i<k;i++) {
	temp[i]=a[a.length-k+i];

}
//		for(int i=0;i<k;i++) {
//			a[i]=a[a.length-k+i];
////			a[0]=a[6-2+0];a[0]=a[4];
////			a[1]=a[6-2+1];a[0]=a[5];
//				
//		}
		System.out.println(Arrays.toString(temp));	
		for(int i=0;i<a.length-k;i++) {
			temp2[i]=a[i];
//			a[0+2]=a[0];a[2]=1;
//			a[1+2]=a[1];a[3]=2;
//			a[2+2]=a[2];a[4]=3;
			
		}
		System.out.println(Arrays.toString(temp2));
		int result[]=new int [a.length];
	for(int i=0;i<k;i++) {
		result[i]=temp[i];
	}
		for(int i=0;i<temp2.length;i++) {
			result[k+i]=temp2[i];
		}
	System.out.println(Arrays.toString(result));
	}

}
