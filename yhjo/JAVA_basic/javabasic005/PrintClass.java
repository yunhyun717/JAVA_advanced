package javabasic005;

public class PrintClass {
	int a, b, n;

	public PrintClass(int a, int b, int n) {
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
