package Assignments;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Perimeter=2×(Length+Width)
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of rectangle=");
		int l=s.nextInt();
		System.out.println("enter width of rectangle=");
		int w=s.nextInt();
		int p=2*(l+w);
		System.out.println("enter perimeter of rectangle="+p);
		s.close();
	}

}
