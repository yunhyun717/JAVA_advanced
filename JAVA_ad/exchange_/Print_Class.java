package exchange_;

import java.util.Scanner;

public class Print_Class {

	public void input1() {
		System.out.print("받은 원화 입력 : ");
	}

	public void input2() {
		System.out.println("\n어떤 화폐로 환전할까요?\n1.USD\n2.EUR\n3.JPY");
	}

	public void Exchange_Result(int how, int money, String[] EX, int[][] CHANGE) {
		System.out.printf("\n%s로 환전 결과", EX[how]);
		System.out.printf("\n지급 : %s %d\n", EX[how], money);
		for (int i = 0; i < CHANGE[how].length; i++) {
			int number = money / CHANGE[how][i];
			if (number != 0) {
				System.out.printf("%s %d : %d 장 ", EX[how], CHANGE[how][i], number);
			}
			money = money % CHANGE[how][i];
		}
	}

	public void change_won(double exchangeResult, int won_chg, int money, String[] EX, int[][] CHANGE,
			double[] EX_RATE) {
		System.out.printf("\n\n원화 거스름 : %d원\n", won_chg);
		for (int i = 0; i < CHANGE[0].length; i++) {
			int number = (int) won_chg / CHANGE[0][i];
			if (number != 0) {
				System.out.printf("%s %d : %d 장 ", EX[0], CHANGE[0][i], number);
			}
			won_chg = won_chg % CHANGE[0][i];
		}
		System.out.print("\n\n");
	}

	public void errorocu() {
		System.out.println("\n잘못 입력하셨습니다.\n");
	}

	public void end() {
		System.out.println("\n프로그램이 종료됩니다.\n");
	}
}