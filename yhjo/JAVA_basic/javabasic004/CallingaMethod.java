package javabasic004;

public class CallingaMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMyMoney1();

		CallingaMethod main = new CallingaMethod();
		main.showMyMoney2();
		main.showMyMoney3();
		main.showMyMoney4();
		main.showMyMoney5();
	}

	public static void showMyMoney1() { // anyone can use
		System.out.println("10000won");
	}

	public void showMyMoney2() { //
		System.out.println("10000won");
	}

	private void showMyMoney3() {
		System.out.println("10000won");
	}

	protected void showMyMoney4() {
		System.out.println("10000won");
	}

	void showMyMoney5() {
		System.out.println("10000won");
	}

}
