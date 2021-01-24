package swimming;
import java.util.Scanner;

public class swimming {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.MON");
		System.out.println("2.TUE");
		System.out.println("3.WED");
		System.out.println("4.THU");
		System.out.println("5.FRI");
		System.out.println("6.SAT");
		System.out.println("7.SUN\n");
		
		int a,b,c,d,e,f,g;
		
		System.out.print("Input : ");
		a=sc.nextInt();
		
		if(a==1||a==3||a==5)
			System.out.println("Output: enjoy ");
		else
			System.out.println("Output: oops ");

	}

}
