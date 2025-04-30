package inheritance;


class Google 
{
	 Google(int id,int age) {
		 System.out.println("constructor3");
	}
	
}

class Amazon extends Google {
	Amazon(String s) 
	{
		super(2,34);
		System.out.println("costructor");
	}

}
public class SuperStatement extends Amazon
{
	SuperStatement() 
	{
		super("java");
		System.out.println("constructor1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SuperStatement();

	}

}
