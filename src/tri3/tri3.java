package tri3;
import java.util.Scanner;

public class tri3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,i,j,k;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		
		for(i=0;i<a;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");//supplement: " " --> "."
			}
			for(k=0;(k+i)<a;k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
