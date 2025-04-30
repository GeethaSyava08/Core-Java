package Assignments;
import java.util.*;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("please enter the value of a=");
		int a=s.nextInt();
		System.out.println("please enter the value of b=");
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("sum="+sum);
		s.close();
	}

}
