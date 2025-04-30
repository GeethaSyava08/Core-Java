package Assignments;

public class FinalVariable {

	
	final static double pi=Math.PI;
	static int days=100;
	static void method()
	{
		final int a=100;
	//a=200;
		System.out.println(a);
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method();
		//pi=5;//final variable we can't change the value
		System.out.println(pi);
		
	}

}
