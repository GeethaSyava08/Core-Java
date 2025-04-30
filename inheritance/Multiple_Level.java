package inheritance;

public class Multiple_Level implements MultipleLevel1, MultipleLevel2 {

	int a = 10, b = 100;

	public static void main(String[] args) {

		Multiple_Level m = new Multiple_Level();
		m.add();
		m.sub();
		MultipleLevel1.disp();// static method in an interface 
	//	MultipleLevel2.
		
	}

	@Override
	public void sub() {

		System.out.println("subtraction" + (a - b));
	}

	@Override
	public void add() {
		System.out.println("Addition=" + (a + b));

	}

}





