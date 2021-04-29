package javabasic004;

public class Overloading_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_2 map = new Overloading_2(); //Public�� �ƴϱ⶧���� ��ü �����ؼ� �����ؾ��Ѵ�.
		map.print("abc", 3, 5);
		map.print("kim");
	}
	
	void print(String text, int number, int number1) {
		for (int i = 0; i<Math.abs(number-number1);i++) {
		System.out.println(text);
		}
	}
	
	void print(String text) {	//overloading ��ɾ�? ������ ���ڿ� ���� ���ǰͰ� �Ʒ����� ���еǾ� ����ȴ�?
		System.out.println(text);
	}
		
}