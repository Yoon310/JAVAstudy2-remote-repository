package comparefrac;
import java.util.Scanner;

public class comparefrac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		if(a/b>c/d)
			System.out.println("Output: 1 ");
		else if(a/b==c/d)
			System.out.println("Output: 0 ");
		else
			System.out.println("Output: -1 ");

	}

}
