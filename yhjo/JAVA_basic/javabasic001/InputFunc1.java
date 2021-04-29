package javabasic001;

import java.util.Scanner;

public class InputFunc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Please input name");
		name = scanner.next();
		System.out.println("name is " + name);
		
		System.out.println("Please input age");
		age = scanner.nextInt();
		System.out.println("age is " + age);
	}
}
