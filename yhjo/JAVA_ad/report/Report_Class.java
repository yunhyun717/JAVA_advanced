package report;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Report_Class {
	private File_Class file;
	private Method_Class meth;
	private Print_Class print;
	private Scan_Class scan;

	public Report_Class() throws FileNotFoundException {
		print = new Print_Class();
		file = new File_Class();
		meth = new Method_Class();
		scan = new Scan_Class();
	}

	public void report(Data_Class data) throws IOException {
		file.file_read(data);
		print.data(data);
		meth.organize(data);
		meth.data_calc(data);
		while (true) {
			scan.choice1(data);
			meth.choice1_result(data);
			scan.choice2(data);
			meth.choice2_result(data);
		}
	}
}
