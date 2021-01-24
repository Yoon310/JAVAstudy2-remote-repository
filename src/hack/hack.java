package hack;
import java.util.Scanner;

public class hack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r,e,c;
		
		System.out.print("Input : ");
		r=sc.nextInt();
		e=sc.nextInt();
		c=sc.nextInt();
		
		if(r<e-c)
			System.out.println("Output: advertise ");
		else if(r==e-c)
			System.out.println("Output: does not matter ");
		else
			System.out.println("Output: do not advertise ");
	}

}
