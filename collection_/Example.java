package collection_;

import java.util.ArrayList;
import java.util.Collection;

public class Example {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(39);
		list.add(99);
		System.out.println(list);
		
		ArrayList list2=new ArrayList();
		list2.add("geetha");
		list2.add("manu");
		list2.add("kriti");
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
		
	}

}
