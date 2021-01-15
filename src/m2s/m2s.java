package m2s;
import java.util.Scanner;

public class m2s {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m;
		System.out.print("minutes : ");
		m=sc.nextInt();
		
		System.out.println(m+ " minutes is " + m*60 + " seconds.");

	}

}
