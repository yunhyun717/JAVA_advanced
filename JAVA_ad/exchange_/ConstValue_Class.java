package exchange_;

import java.util.Scanner;

public class ConstValue_Class {
	final static double[] EX_RATE = { 1127.40, 1328.08, 10.1976 }; // USD, EUR, JPY
	final static int[][] CHANGE = { { 1000, 500, 100, 50, 10 }, { 100, 50, 20, 10, 5, 2, 1 },
			{ 500, 200, 100, 50, 20, 10, 5, 2, 1 }, { 10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1 } };
	// KRW, USD, EUR, JPY
	final static String[] EX = { "KRW", "USD", "EUR", "JPY" };
	final static String FILEDIR = ("C:\\Users\\yunhyun jo\\Desktop\\Exchange.csv");

}
