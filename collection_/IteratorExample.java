package collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(90);
		System.out.println(list);
		
		Iterator<Integer> i=list.iterator();
		System.out.println("iteration using iterator");
		while(i.hasNext())
		{
			Integer value=i.next();
			System.out.println(value);
		}
		
	}

}
