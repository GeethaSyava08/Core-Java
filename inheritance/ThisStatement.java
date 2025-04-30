package inheritance;

public class ThisStatement //constructor chaining
{

	ThisStatement(int a)
	{
		this(12.4);
		System.out.println("constructor1");
	}
	ThisStatement()
	{
		this(9);
		System.out.println("constructor2");
		
	}
	ThisStatement(String s)
	{
		this();
		System.out.println("constructor3");
	}
	ThisStatement(double d)
	{
		System.out.println("constructor4");
	}
	public static void main(String[] args) {

		
		new ThisStatement("java");
	}

}
