package coci_note;
import java.util.Scanner;

public class coci_note {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c,d,e,f,g,a,h,C;
		
		System.out.print("Input : ");
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		g=sc.nextInt();
		a=sc.nextInt();
		h=sc.nextInt();
		C=sc.nextInt();
		
		if(c==1&&d==2&&e==3&&f==4&&g==5&&a==6&&h==7&&C==8)
			System.out.println("Output: ascending ");
		else if(c==8&&d==7&&e==6&&f==5&&g==4&&a==3&&h==2&&C==1)
			System.out.println("Output: descending ");
		else
			System.out.println("Output: mixed 1");

	}

}
