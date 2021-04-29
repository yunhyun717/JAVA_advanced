package javabasic_testA;

import java.util.ArrayList;

public class Test6 implements Statistics{

	public static void main(String[] args) {
		Test6 test6 = new Test6();
		double [] numbers = {1.2, 3.2, 5.2, 12.3, 45.0, -3.4, -6.7};
		ArrayList<Double> temp = new ArrayList<Double>();
		for (int i = 0; i<numbers.length; i++) {
			temp.add(numbers[i]);
		}
		temp.sort();
		double max = test6.getMaxNumber(numbers);
		double min = test6.getMinNumber(numbers);
		System.out.printf("maximum : %.1f, minimum : %.1f", max, min);
	}

	public double getMaxNumber(ArrayList<Double> temp) {
		double max = numbers[0];
		for (int i =1; i<numbers.length; i++) {
			max = Math.max(max, numbers[i]);
		}
		return max;
	}

	public double getMinNumber(double[] numbers) {
		double min = numbers[0];
		for (int i =1; i<numbers.length; i++) {
			min = Math.min(min, numbers[i]);
		}
		return min;
	}

}
