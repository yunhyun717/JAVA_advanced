package javabasic007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayList_ {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));

		for (int i = 0; i < 3; i++) {
			System.out.print(name.get(i)+" ");
		}
		System.out.println();

		name.remove(1);
		System.out.println(name);

		name.set(1, "park");
		System.out.println(name);
		System.out.println(name.size());

		name.add("lee");

		Collections.sort(name);
		
		System.out.println(name);

		Collections.sort(name);
		System.out.println(name);

		Collections.reverse(name);
		System.out.println(name);

		ArrayList<Integer> inte = new ArrayList<Integer>();
		
		inte.add(2);
		inte.add(4);
		inte.add(3);
		inte.add(1);
		inte.add(5);
		Collections.sort(inte);
		System.out.println(inte);
		
	}

}
