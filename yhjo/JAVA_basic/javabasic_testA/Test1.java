package javabasic_testA;

public class Test1 {

	public static void main(String[] args) {

		int myNumber1 = 6;
		System.out.println(myNumber1);
		System.out.println(++myNumber1);
		System.out.println(myNumber1++);
		myNumber1 = myNumber1 * 2;
		int myNumber2 = 7;
		System.out.println(myNumber2);

		myNumber1 = myNumber1 + 46;
		System.out.println(myNumber1);

		myNumber2 = myNumber2 - myNumber1;
		System.out.println(myNumber2);
	}
}
