package inheritance;


public class SingleInheritance extends SingleInheritance1 {
	
	static void disp1()
	{
		System.out.println("child class");
	}
	void mul()
	{
		System.out.println("multiplication");
	}

	public static void main(String[] args) {

		disp1();
		SingleInheritance s=new SingleInheritance();
		s.disp();
		add();
		s.mul();
	}

}
