package collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Sort_List {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("kriti");
		list.add("manu");
		list.add("geetha");
		list.add("family");

		Collections.sort(list);
		System.out.println(list);
		
		/*
		 * Iterator<String> i=list.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
	}

}
