package printe;
import java.util.Scanner;

public class printe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,i,j;
		
		System.out.print("Input() : ");
		a=sc.nextInt();
		
		if(a%2==1) {
			for(i=1;i<=a;i++) {
				if(i==1||i==(a/2)+1||i==a) {
					for(j=0;j<a;j++) {
						System.out.print("*");
					}
				}
				else {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("Enter an odd number!");
		}

	}

}
