package exchange_;

import java.util.Scanner;

public class Value_Class {

	public int money(int won, int how, double[] EX_RATE) {
		int money = (int) (won / EX_RATE[how - 1]);
		return money;
	}

	public double exchangeResult(int won, int how, double[] EX_RATE) {
		double exchangeResult = won / EX_RATE[how - 1];
		return exchangeResult;
	}

	public int won_chg(double exchangeResult, int money, double[] EX_RATE, int how, int won) {
		int won_chg = (int) ((exchangeResult - money) * EX_RATE[how - 1] / 10) * 10;
		return won_chg;
	}

}
