package Assignments;

public class GlobalVariable {
	
	String s="GlobalVriable";
	static int a=20;
	
	static void staticMethod()// Static method (Can access only static variables directly)
	{
		System.out.println("Static global variable in static method:" +a);
		
	}
	void nonStaticMethod()
	{
		System.out.println("Static global variable in non-static method: "+s);
		System.out.println("Non-static global variable in non-static method:" +a);
	}

	public static void main(String[] args) {

		
		staticMethod();
		GlobalVariable g=new GlobalVariable();
		g.nonStaticMethod();
	}

}
