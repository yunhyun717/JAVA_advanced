package exchange_;

import java.util.Scanner;

public class Scan_Class {
	Scanner scan = null;

	public Scan_Class() {
		scan = new Scanner(System.in);
	}

	public int inputwon() {
		int won = scan.nextInt();
		return won;
	}

	public int inputhow() {
		int how = scan.nextInt();
		return how;
	}
	
	protected void finalize() throws Throwable {
		scan.close();
	}
}


