package javabasic005;

public class Inheritance extends Inheritance_sup {
	public Inheritance() {
	}

	public static int power = 10;

	public static void main(String[] args) {
		Inheritance inhe = new Inheritance();
		inhe.printPower();
	}

	public void printPower() {
		super.printPower();
		System.out.println(power);
		System.out.println(super.power);
	}

}