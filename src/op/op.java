package op;
import java.util.Scanner;

public class op {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(a+" + "+b+" = "+ (a+b));
		System.out.println(a+" - "+b+" = "+ (a-b));
		System.out.println(a+" * "+b+" = "+ a*b);
		System.out.println(a+" / "+b+" = "+ a/b);
		System.out.println(a+" % "+b+" = "+ a%b);

	}

}
