package javabasic004;

public class Returning_a_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum = addOperation(5, 12);
		System.out.println(sum);

	}

	public static int addOperation(int a, int b) {
		int sum = a + b;
		return sum;
	}
}