// Abstract class definition
public abstract class ASCII {

	public static void main(String[] args) {
		//ascii values
		String a="ramesh";
		char c;
		int sum=0;
		for(int i=0;i<a.length();i++) {
			c=a.charAt(i);
			System.out.println((int )c);
			sum=sum+c;
			
		}
		System.out.println("sum is "+sum);
	}
	
}