package javabasic005;

public class P1_method {
	int a, b, c, d, n;

	public P1_method(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int printprice(int n) {
		int result = 0;
		if (n == 1) {
			result = this.a;
		} else if (n == 2) {
			result = this.b;
		} else if (n == 3) {
			result = this.c;
		} else if (n == 4) {
			result = this.d;
		}
		return result;
	}
}
