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
		data.dorncode = scan.nextInt() - 1;
	}

	public void reginum(Data_Class data) {
		print.inputreginum();
		data.reginum = scan2.nextLine();
	}

	public void nums(Data_Class data) {
		print.inputnums();
		data.nums = scan.nextInt();
	}

	public void treat(Data_Class data) {
		print.inputtreat();
		data.treatcode = scan.nextInt() - 1;
	}

	public void temp(Data_Class data) {
		print.price_result(data);
		data.temp = scan.nextInt();
	}
	
	public void temp2(Data_Class data) {
		print.temp2();
		data.temp2 = scan.nextInt();
	}

	protected void finalize() throws Throwable {
		scan.close();
	}
}
