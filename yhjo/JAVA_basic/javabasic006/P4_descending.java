package javabasic006;

public class P4_descending {

	public static void main(String[] args) {
		int[] numbers = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		int a = 0;
		for (int i = 0; i < numbers.length; i++) {
			a = numbers[i];
			for (int j = 0; j < numbers.length; j++) {
				a = Math.max(a, numbers[j]);
			}
			for (int k = 0; k < numbers.length; k++) {
				if (numbers[k] == a) {
					numbers[k] = 0;
				}
			}
			System.out.print(a + " ");
			
			
		}
	}
}
