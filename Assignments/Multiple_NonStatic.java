package Assignments;

public class Multiple_NonStatic {

	void add(int a, int b) {
		System.out.println("Addition");
	}
	
	void sub(int a,int b)
	{
		System.out.println("Subtraction");
	}
	void print(String a,String b)
	{
		
		System.out.println("geetha");
	}
	public static void main(String[] args) {

		Multiple_NonStatic n = new Multiple_NonStatic();

		n.add(3, 10);
		n.sub(9, 6);
		n.print("str", "str1");
		
	}

}
