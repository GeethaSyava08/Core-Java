package inheritance;

class IParent {

	int a = 10, b = 30; // global variable

	void add() {
		a +=b; //b value added to a(updated a)
		System.out.println("sum of a&b=" +a);
	}
}

public class Inheritance extends IParent {

	void sub() 
	{

		int d = a - b;
		System.out.println("sub of a&b=" +d);
	}

	public static void main(String[] args) {

		Inheritance i = new Inheritance();
		i.add();
		i.sub();

	}

}
