package Assignments;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		
		double area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base of triangle");
		int b=s.nextInt();
		System.out.println("enter the height of triangle");
		int h=s.nextInt();
		area=0.5*b*h;
		System.out.println("The area of triangle is  "+area);	
		s.close();
	}

}
