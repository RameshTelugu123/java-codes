import java.util.Scanner;

public class appendNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" ramesh ");
		}else{
			System.out.println(num+" koti ");
		}

	}

}
