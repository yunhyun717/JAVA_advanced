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

	public void DorN(Var_Class var) {
		print.inputDorN();
		var.dorncode = scan.nextInt() - 1;
	}

	public void reginum(Var_Class var) {
		print.inputreginum();
		var.reginum = scan2.nextLine();
	}

	public void nums(Var_Class var) {
		print.inputnums();
		var.nums = scan.nextInt();
	}

	public void treat(Var_Class var) {
		print.inputtreat();
		var.treatcode = scan.nextInt() - 1;
	}

	public void temp(Var_Class var) {
		print.price_result(var);
		var.temp = scan.nextInt();
	}
	
	public void temp2(Var_Class var) {
		print.temp2();
		var.temp2 = scan.nextInt();
	}

	protected void finalize() throws Throwable {
		scan.close();
	}
}
