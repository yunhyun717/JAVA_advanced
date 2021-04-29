package report;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Data_Class data = new Data_Class();
		Report_Class report = new Report_Class();
		report.report(data);
	}
}
