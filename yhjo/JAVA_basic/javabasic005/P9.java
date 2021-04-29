package javabasic005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		String[] Course = { "Korean", "Math", "English", "Social Studies", "Science" };
		HashSet<String> MyList = new HashSet<String>();
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. CourseList");
			System.out.println("2. My Course");
			int n = scan.nextInt();
			System.out.println();
			switch (n) {
			case 1:
				System.out.println("#Course List");
				for (int i = 0; i < Course.length; i++) {
					System.out.printf("%d. %s\n", i + 1, Course[i]);
				}
				System.out.println("0. Back to Main");
				System.out.print("->");
				int k = scan.nextInt();
				if (k > 0 && k < 6) {
					MyList.add(Course[k - 1]);
					System.out.printf("\"%s\" is registered.\n\n", Course[k - 1]);
					break;
				}

			case 2:
				System.out.println("#My Course");
				Iterator<String> iterator = MyList.iterator();
				int i = 1;
				while (iterator.hasNext()) {
					System.out.println(i + ". " + iterator.next());
					i++;
				}
				System.out.println("- END -\n");
			}
		}
	}

}
