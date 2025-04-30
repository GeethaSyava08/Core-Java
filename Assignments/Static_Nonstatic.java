package Assignments;

public class Static_Nonstatic {
	
	
	
	static void add() //static method
	{
		System.out.println("static method");
	}
	void add(int a)//non static method
	{
		System.out.println("non static method");
	}
	
	Static_Nonstatic(char a) //constructor
	{
		System.out.println("gita");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		Static_Nonstatic s=new Static_Nonstatic('k');
		s.add(90);
		
		
	}

}
