package Assignments;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi=3.14, area;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=s.nextDouble();
		area=pi*r*r;
		System.out.println("The area of circle is="+area);	
		s.close();
	}

}
