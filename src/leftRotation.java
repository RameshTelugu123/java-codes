import java.util.Arrays;

public class leftRotation {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		//output : k=2, {3,4,5,1,2}
		int k=2;
		int b[]=new int[k];
		
		int[] temp = new int[k];
		
        for (int i=0;i<k;i++) {
        	temp[i]=a[i];
        }
        for(int i=0;i<a.length-k;i++) {
        	a[i]=a[i+k];
//        	0    =0+2 a[2]=3
//        1   =1+2    a[3]=4
//        2   =2+2;   a[4]=5
        	
          }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<k;i++) {
        	a[a.length-k+i]=temp[i];
//        	a[5-2+1]=temp[0]; a[4]=1;
//        	a[5-2+2]=temp[1]; a[5]=2;
        }
System.out.println(Arrays.toString(a));
	}

}
