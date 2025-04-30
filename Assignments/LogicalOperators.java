package Assignments;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100, b = 20;
		double c=21.2, d=30.9;
		if (a > 80 && b == 20)
		{
			System.out.println("AND operator");
		}
		if (a < b || b != a)
		{
			System.out.println("OR operator");
		}
		if(!(c>d&&d== a))
		{
			System.out.println("AND NOt operator");
		}
		if(!(c!=21||d<c))
		{
			System.out.println("OR Not operator");
		}
	}

}
