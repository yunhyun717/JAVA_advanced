package javabasic004;

public class MethodandParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodandParameter map = new MethodandParameter(); //Public�� �ƴϱ⶧���� ��ü �����ؼ� �����ؾ��Ѵ�.
		map.print("abc", 3, 5);
		map.print("kim", 5, 3);
	}
	
	void print(String text, int number, int number1) {
		for (int i = 0; i<Math.abs(number-number1);i++) {
		System.out.println(text);
		}
	}
		
}