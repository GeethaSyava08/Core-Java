package inheritance;

import java.util.Scanner;

public class MultiChild extends MultiParent1

{
	
	void disp(int n) {
		
		System.out.println("you entered value is"  +n);
		/*
		 * Scanner s = new Scanner(System.in); 
		 * System.out.println("please enter n =");
		 * int n=s.nextInt(); 
		 * s.close();
		 */
	}

	static void method() {
		System.out.println("child class");
	}

	public static void main(String[] args) {

		MultiChild m = new MultiChild();
		Scanner s=new Scanner(System.in);
		m.method1();
		m.method2();
		method();

		System.out.println("please enter n value=");
		int i=s.nextInt();
		m.disp(i);

	}

}
