package ticket;

import java.io.IOException;

public class Ticket_Class {

	private Print_Class print;
	private Scan_Class scan;
	private Method_Class meth;
	private File_Class file;

	public Ticket_Class() throws IOException {
		print = new Print_Class();
		scan = new Scan_Class();
		meth = new Method_Class();
		file = new File_Class();
	}

	public void Ticket(Data_Class data) {
		scan.DorN(data);
		scan.reginum(data);
		meth.getAge(data);
		scan.nums(data);
		scan.treat(data);
		meth.price(data);
		meth.add(data);
		scan.temp(data);
	}

	public void Process(Data_Class data) {
		try {
			while (true) {
				Ticket(data);
				if (data.choice1 == 2) {
					meth.dataSort(data);
					print.total_price_result(data);
					scan.temp2(data);
					if (data.choice2 == 2) {
						file.file(data);
						break;
					}
				}
			}
		} catch (Exception e) {
			print.errorocu();
			e.printStackTrace();
		}
	}
}
