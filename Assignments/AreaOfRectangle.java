package Assignments;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter length of rectangle=");
		int l=s.nextInt();
		System.out.println("enter width of rectangle=");
		int w=s.nextInt();
		int area=l*w;
		System.out.println("enter area of rectangle="+area);
		s.close();
	}

}
