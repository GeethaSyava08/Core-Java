package Assignments;

public class GlobalVar {

	
	static int g=100;
	static int x;
	
	public static void sum()
	{
		x=12;
		int y=10;
		g=20; //update global variable
		int z=x+y+g;
		System.out.println("The sum is= "+z);
		
	}
	void sub(int n)
	{
		n=50;
		int sub = n-g;
		System.out.println("The subtraction is=" +sub);
	}
	
	
	public static void main(String[] args) {
		sum();
		GlobalVar g=new GlobalVar();
		g.sub(90);

	}

}
