package javabasic004;

public class Overloading_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("hello?");
		print(1, 3);
	}
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static void print(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
		
}