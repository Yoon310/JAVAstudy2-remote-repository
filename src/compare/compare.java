package compare;
import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>b)
			System.out.println("Output: > ");
		else if(a==b)
			System.out.println("Output: = ");
		else
			System.out.println("Output: > ");
		
	}

}
