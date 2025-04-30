package inheritance;

public class MethodOverloading {
	
	static void add()
	{
		System.out.println("Method Overloading");
	}
	static void add(int a,int b)
	{
		System.out.println("Method Overloading1");
	}
	void add(double a) //non static
	{
		System.out.println("Method Overloading2 _non static");
	}
	 MethodOverloading(int c) 
	 {
		
		System.out.println("Constructor");
	}
	
	static void add(String s)
	{
		System.out.println("Method Overloading3");
	}
	
	public static void add(boolean b)
	{
		System.out.println("Method Overloading4");
	}
	static void add(char a)
	{
		System.out.println("Method Overloading5");
	}
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading(4);
		m.add(12.32123);
		add();
		add(3,9);
		add("java");
		add(true);
		add('g');
		
	}

}
