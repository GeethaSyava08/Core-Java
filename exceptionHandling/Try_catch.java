package exceptionHandling;

public class Try_catch {

	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println(str.length());
			int[] arr = new int[5];
			arr[10] = 20;

		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} finally {
			System.out.println("This block is always executed.");
		}
	}

}
