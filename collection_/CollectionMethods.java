package collection_;

import java.util.ArrayList;

public class CollectionMethods {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add("java");
		al2.add("code");
		al2.add("program");
	
		System.out.println(al2); 
		al.addAll(al2);
		System.out.println(al); 
		//al.clear();
		//System.out.println("After Clearing the data "+al); // Output: []
		System.out.println(al2.contains("java"));
		System.out.println(al.containsAll(al2));
		System.out.println(al.isEmpty());
		
		al2.remove("code");
		System.out.println(al2);
		
		
		ArrayList al3=new ArrayList();
		al3.add("kriti");
		al3.add("gita");
		al3.add("manu");
		al3.add("gita");
		al3.add("code");
		//System.out.println(al3.size());
	//	al3.removeAll(al3);
		System.out.println(al3);
		Object s=al3.lastIndexOf("gita"); //last occurance
		System.out.println(s);
		int a=al3.indexOf("gita");//first occurance
		System.out.println(a);
		al3.add(1, "jyo");
		System.out.println(al3);
		
		//String s1="manu";
		//al3.removeIf(s1.equals("manu"));
		
	}
	

	}


