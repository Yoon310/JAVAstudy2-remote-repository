package swap;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,swap;
		
		System.out.print("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		swap=a;
		a=b;
		b=swap;
		
		System.out.println(a);
		System.out.println(b);

	}

}
