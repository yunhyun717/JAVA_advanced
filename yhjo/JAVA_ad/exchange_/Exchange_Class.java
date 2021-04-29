package exchange_;

import java.io.IOException;

public class Exchange_Class {
	private File_Class file;
	private Print_Class print;
	private Scan_Class scan;
	private Value_Class value;

	public Exchange_Class() throws IOException {
		file = new File_Class();
		print = new Print_Class();
		scan = new Scan_Class();
		value = new Value_Class();
	}

	public void exchange(ExType_Class ext) {
		while (true) {
			try {
				scan.inputwon(ext);
				scan.inputhow(ext);
				value.money(ext);
				value.won_chg(ext);
				file.file(ext);
				print.Exchange_Result(ext);
				print.change_won(ext);

			} catch (Exception e) {
				print.errorocu();
			}
		}
	}
}

