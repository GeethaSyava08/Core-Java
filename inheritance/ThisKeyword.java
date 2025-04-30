package inheritance;

class Amazon1 {

	String username, password;

	void placeOrder()

	{
		this.payment();
		System.out.println("order placed");
	}

	void payment() {
		System.out.println("payment processed");
	}

	Amazon1(String un, String pw) {
		this.username = un;
		this.password = pw;
	}

	void display() {
		System.out.println(username);
		System.out.println(password);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amazon1 a = new Amazon1("java", "sfbjhsdg7");
		a.placeOrder();
		a.display();
	}

}
