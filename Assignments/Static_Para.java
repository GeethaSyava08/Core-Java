package Assignments;

public class Static_Para {
	
	
	static void disp(String s)
	{
		System.out.println("Display");
	}
	static void disp(char a,boolean b)
	{
		System.out.println("Dispaly1");
	}
	static void disp(int a,int b)
	{
		System.out.println("Display2");
	}
	static public  void disp(double b,float f)
	{
		
		System.out.println("Display3");
		
	}
	static void disp()
	{
		System.out.println("Display4");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		disp();
		disp(18.9894, 3.4f);
		disp(2,3);
		disp('m',true);
		disp("java");
		
	}

}
