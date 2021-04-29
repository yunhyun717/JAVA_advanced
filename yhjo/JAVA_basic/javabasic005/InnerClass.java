package javabasic005;

public class InnerClass {

	public static void main(String[] args ) {
		PrintClass2 printClass = new PrintClass2(1,2,5);
		printClass.printInteger();
		printClass.printAdd();
	}
}

class PrintClass2 {
	int a, b, n;

	public PrintClass2(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}

	public void printInteger() {
		System.out.println(this.n);
	}

	public void printAdd() {
		int sum;
		sum = this.a + +this.b;
		System.out.println(sum);
	}
}
