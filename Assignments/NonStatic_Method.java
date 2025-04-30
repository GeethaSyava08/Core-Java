package Assignments;

public class NonStatic_Method {
	
    int a=100;
	int b=200;
	void add()
	{
		
		int sum=a+b;
		System.out.println("addition=" +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStatic_Method c=new NonStatic_Method();
		c.add();
		

	}

}
