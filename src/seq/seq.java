package seq;
import java.util.Scanner;

public class seq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,i;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.print("Output : ");
		if(a<b) {
			for(i=a;i<=b;i++) {
				System.out.print(i+" ");
			}
		}
		else {
			for(i=b;i<=a;i++) {
				System.out.print(i+" ");
			}
		}
		
	}

}
