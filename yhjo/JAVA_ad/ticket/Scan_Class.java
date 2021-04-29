package ticket;

import java.util.Scanner;

public class Scan_Class {
	private Scanner scan;
	private Scanner scan2;
	private Print_Class print;

	public Scan_Class() {
		scan = new Scanner(System.in);
		scan2 = new Scanner(System.in);
		print = new Print_Class();
	}

	public void DorN(Data_Class data) {
		print.inputDorN();
		while (true) {
			data.dorncode = scan.nextInt() - 1;
			System.out.println();
			if (data.dorncode == 0 || data.dorncode == 1) {
				break;
			} else {
				print.error();
			}
		}
	}

	public void reginum(Data_Class data) {
		print.inputreginum();
		while (true) {
			data.reginum = scan2.nextLine();
			System.out.println();
			if (data.reginum.length() == 13) {
				break;
			} else {
				print.error();
			}
		}
	}

	public void nums(Data_Class data) {
		print.inputnums();
		while (true) {
			data.nums = scan.nextInt();
			System.out.println();
			if (data.nums < 11 && data.nums > 0) {
				break;
			} else {
				print.error();
			}
		}
	}

	public void treat(Data_Class data) {
		print.inputtreat();
		while (true) {
			data.treatcode = scan.nextInt() - 1;
			System.out.println();
			if (data.treatcode < 5 && data.treatcode > -1) {
				break;
			} else {
				print.error();
			}
		}
	}

	public void choice1(Data_Class data) {
		print.price_result(data);
		while (true) {
			data.choice1 = scan.nextInt();
			System.out.println();
			if (data.choice1 == 1 || data.choice1 == 2) {
				break;
			} else {
				print.error();
			}
		}
	}

	public void choice2(Data_Class data) {
		print.temp2();
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
