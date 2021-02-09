package tri1;
import java.util.Scanner;

public class tri1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,i,j;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		
		for(i=1;i<=a;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
