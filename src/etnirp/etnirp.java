package etnirp;
import java.util.Scanner;

public class etnirp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,i,j,k;
		
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
					for(k=1;k<a;k++) {
						System.out.print(" ");
					}
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
