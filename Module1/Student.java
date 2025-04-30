package Module1;

public class Student {

	int id;
	String name;
	static String Ename;
	static float Esal;

	public void printStudent() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
	}

	static void get(String a, float b) {
		Ename = a;
		Esal = b;
		System.out.println("Employee name is: " + Ename);
		System.out.println("Employee CTC is: " + Esal);
	}

	public Student(char a) {

		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		Student s = new Student('g');
		new Student('d');

		s.id = 1;
		s.name = "geethas";

		s.printStudent();
		get("geetha", 10000);
	}
}
