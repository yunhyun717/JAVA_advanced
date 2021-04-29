package exchange_;

import java.util.Scanner;

public class Scan_Class {
	private Scanner scan;
	private Print_Class print;

	public Scan_Class() {
		scan = new Scanner(System.in);
		print = new Print_Class();
	}

	public void inputwon(ExType_Class ext) {
		print.input1();
		ext.won = scan.nextInt();
	}

	public void inputhow(ExType_Class ext) {
		print.input2();
		ext.how = scan.nextInt();
	}
	
	protected void finalize() throws Throwable {
		scan.close();
	}
}


