package Assignments;

public class LocalVariable {

	static void add() //static method
	{
		int a, b ,c;//declaratiom
		a = 10;//initialization
		a = 50;
		b = 20;
		c = a + b;
		System.out.println(c);//utilizatiom

	}

	public void sub()//non static method
	{
		int a, b;
		a = 20;
		b = 20;
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add();

		LocalVariable l = new LocalVariable();
		l.sub();
	}

}
