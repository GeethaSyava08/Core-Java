package Module1;

public class Operators_Static {
	
	
	static void add()
	{
		System.out.println("Addition");
		int a=100;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
		
	}
	static void sub()
	{
		
		System.out.println("Subtraction");
		int a=200;
		int b=50;
		int sub=a-b;
		System.out.println(sub);
		
	}
	static void mul()
	{
		sub();
		System.out.println("Multiply");
		
	}
	static void div() //will get quotient
	{
		System.out.println("Division");
	}
	static void mod()
	{
		System.out.println("MOdulus"); //will get reminder
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		sub();
		mul();
		div();
		mod();
		

	}

}
