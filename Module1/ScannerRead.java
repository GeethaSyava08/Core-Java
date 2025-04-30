package Module1;

import java.util.Scanner;

public class ScannerRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s= new Scanner(System.in);
		
		int a=s.nextInt();
		System.out.println("Entered integer" +a);
		
		String s1= s.nextLine();
		System.out.println("Entered String  "+s1);
		
		float f=s.nextFloat();
		System.out.println("Entered float "+f);
		
		

	}

}
