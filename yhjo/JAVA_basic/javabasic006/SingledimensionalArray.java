package javabasic006;

public class SingledimensionalArray {

	public static void main(String[] args) {
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //numbers setting
		String[] name = { "kim", "lee", "park" };
		
		numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		String [] str = new String[5];//str[0]~str[4]
		
	}

}
