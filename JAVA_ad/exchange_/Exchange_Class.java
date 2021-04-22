package exchange_;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Exchange_Class {
	private Print_Class print;
	private Scan_Class scan;
	private Value_Class value;
	private File_Class file;
	private double[] EX_RATE = ConstValue_Class.EX_RATE;
	private int[][] CHANGE = ConstValue_Class.CHANGE;
	private String[] EX = ConstValue_Class.EX;
	private int won, how, money, won_chg;
	private double exchangeResult;

	public Exchange_Class() throws IOException {
		print = new Print_Class();
		scan = new Scan_Class();
		value = new Value_Class();
		file = new File_Class();
	}

	public void exchange() {

		while (true) {
			try {
				print.input1();
				won = scan.inputwon();
				print.input2();
				how = scan.inputhow();
				money = value.money(won, how, EX_RATE);
				exchangeResult = value.exchangeResult(won, how, EX_RATE);
				won_chg = value.won_chg(exchangeResult, money, EX_RATE, how, won);
				print.Exchange_Result(how, money, EX, CHANGE);
				print.change_won(exchangeResult, won_chg, money, EX, CHANGE, EX_RATE);
				file.file(won, how, money, won_chg);

			} catch (NoSuchElementException e) {
				print.end();
				break;
			} catch (Exception e) {
				print.errorocu();
				e.printStackTrace();
				break;
			}
		}
	}
}
