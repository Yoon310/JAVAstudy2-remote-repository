package tri2;
import java.util.Scanner;

public class tri2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,i,j;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		
		for(i=0;i<a;i++) {
			for(j=0;(j+i)<a;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
