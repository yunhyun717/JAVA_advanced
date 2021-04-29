package javabasic005;

public class P5 {

	public static void main(String[] args) {
		Printit printClass = new Printit("Hi!Hello?");
		printClass.printString();
	}
}

class Printit {
	String temp;

	public Printit(String temp) {
		this.temp = temp;
	}

	public void printString() {
		System.out.println(this.temp);
	}
}
