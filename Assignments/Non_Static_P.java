package Assignments;

public class Non_Static_P {

	public void add(String s) {
		System.out.println("1");
	}

	void add(double d, float f) {
		System.out.println("2");
	}

	private Non_Static_P(int l, int b) {
		System.out.println("3");
	}

	public void add(int a, int b) {
		System.out.println("Addition");
	}

	void add(boolean b) {
		System.out.println("non static methods");
	}

	protected void name(char a) {

		System.out.println("parameterized methods");
	}

	public static void main(String[] args) {

		Non_Static_P n = new Non_Static_P(9, 9);

		n.add("java");
		n.add(19.99090, 2.9f);
		n.add(7, 20);
		n.name('k');
		n.add(true);

	}

}
