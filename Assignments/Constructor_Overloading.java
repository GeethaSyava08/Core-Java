package Assignments;

public class Constructor_Overloading {
	
	
	public Constructor_Overloading()
	{
		System.out.println("constructor overloading");
	}

	Constructor_Overloading(int a, int b)
	{
	System.out.println("constructor overloading1");	
	
	}	
	
	public static void main(String[] args) {
		Constructor_Overloading c=new Constructor_Overloading();
		
		new Constructor_Overloading(7, 9);

		
	}

}
