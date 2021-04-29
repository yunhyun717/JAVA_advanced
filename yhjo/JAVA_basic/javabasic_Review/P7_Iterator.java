package javabasic_Review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P7_Iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
