package area;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("width : ");
		a=sc.nextInt();
				
		System.out.print("length : ");
		b=sc.nextInt();		
		System.out.println("Area :"+ a*b);		

	}

}
