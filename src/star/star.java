package star;
import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,i;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		
		for(i=0;i<a;i++) {
			System.out.print("*");
		}

	}

}
