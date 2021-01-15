package triangle;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,b;
		
		System.out.print("the base side : ");
		a=sc.nextInt();
				
		System.out.print("Height : ");
		b=sc.nextInt();		
		System.out.println("the width of a triangle: "+ (a*b)/2);

	}

}