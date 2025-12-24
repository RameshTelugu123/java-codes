
public class countEvenOdd {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,6,7,8,};
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				ecount++;
			}else {
				ocount++;
			}
		}
System.out.println("even "+ecount);
System.out.println("odd "+ocount);
	}

}
