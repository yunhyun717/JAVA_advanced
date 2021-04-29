package report;

import java.util.Scanner;

public class Scan_Class {
	private Scanner scan;
	private Print_Class print;

	public Scan_Class() {
		scan = new Scanner(System.in);
		print = new Print_Class();
	}

	public void choice1(Data_Class data) {
		print.choice1();
		while (true) {
			data.choice1 = scan.nextInt();
			System.out.println();
			if (data.choice1 == 1 || data.choice1 == 2 || data.choice1 == 3) {
				break;
			} else {
				print.error();
			}
		}
	}

	public void choice2(Data_Class data) {
		print.choice2();
		while (true) {
			data.choice2 = scan.nextInt();
			System.out.println();
			if (data.choice2 == 1 || data.choice2 == 2) {
				break;
			} else {
				print.error();
			}
		}
	}

	protected void finalize() throws Throwable {
		scan.close();
	}
}
