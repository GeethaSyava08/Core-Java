package collection_;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(54);
		al.add(23);
		al.add(38);
		al.add(79);
		
		System.out.println(al);
		
		ListIterator<Integer> li= al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
			/*
			 * int index=li.nextIndex(); int value=li.next(); System.out.println("index"
			 * +index +":" +value);
			 */
		}
		while(li.hasPrevious())
		{
			int index1=li.previousIndex();
			int value1=li.previous();
			System.out.println("-----index" +index1 +":" +value1);
		}
		
	}

}
