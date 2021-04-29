package javabasic005;

public class Interprice_M implements InterPrice{
	public static void main(String[] args) {
		Interprice_M m = new Interprice_M();
		m.getPriceA(100);
		m.getPriceB(100);
	}
	
	public void getPriceA(int price) {
		System.out.println(price + 100);
	}
	public void getPriceB(int price) {
		System.out.println(price + 1000);
	}
}
