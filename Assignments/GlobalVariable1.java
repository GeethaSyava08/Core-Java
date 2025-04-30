package Assignments;

public class GlobalVariable1 {
	
	static double salary=30000;
	static double pi;
	int days=30;
	static String name;
	
	int a=20; 
	static int b=100;
	
	void add() {
		System.out.println(a+b);
		System.out.println(days);
	}
	static void sub() // non static variable to static method we can create object
	{
		GlobalVariable1 g=new GlobalVariable1();
		System.out.println(salary);
		System.out.println(g.a-b);
	}

	public static void main(String[] args) {
		
		b=10; //update static Variable
		name="java";
		System.out.println(name);
		System.out.println(pi);
		
		GlobalVariable1 g1=new GlobalVariable1();
		g1.a=50; //update non static global variable, we can create an object
		g1.add();
		sub();
		
		
	}

}
