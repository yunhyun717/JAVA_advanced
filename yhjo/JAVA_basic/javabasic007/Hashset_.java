package javabasic007;

import java.util.HashSet;

public class Hashset_ {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		HashSet<String> name1 = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		name.add("kim");
		System.out.println(name);
		name.clear();
		System.out.println(name);
		name.addAll(name1);
	}
}
