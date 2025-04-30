package string;

public class TocharArrayExample {

	public static void main(String[] args) {

		String s="Javaprogram";
		char[] c=s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)//a.length - 1 gives the last index of the array (in this case, 3).
		{
		System.out.print(c[i]);	//String reversed += chars[i];//logic of reverse
		}
		
	}

}
