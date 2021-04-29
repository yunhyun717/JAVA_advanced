package javabasic_Review;

import java.util.ArrayList;

public class P6_1 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		String[] name = { "kim", "lee", "park" };
		
		System.out.println(numbers[9]);
		System.out.println(name[2]);
		
		
		ArrayList<String> name2 = new ArrayList<String>();
		name2.add("kim");
		name2.add("lee");
		name2.add("park");
		
		for (int i=0;i<name2.size();i++) {
		System.out.printf("%s ",name2.get(i));
		}
	}

}
