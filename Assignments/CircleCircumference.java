package Assignments;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double pi=3.14, c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=s.nextInt();
		c=2*pi*r;
		System.out.println("The Circle Circumference is"+c);	
		s.close();
	}

}
