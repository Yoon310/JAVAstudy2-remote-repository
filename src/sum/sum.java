package sum;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,i,sum;
		sum=0;
		
		System.out.print("Input : ");
		for(i=0;i<7;i++) {
			n=sc.nextInt();
			sum+=n;
		}
		
		System.out.println("Output : "+sum);

	}

}
