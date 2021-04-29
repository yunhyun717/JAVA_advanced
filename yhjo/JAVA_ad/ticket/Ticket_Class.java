package ticket;

import java.io.IOException;

public class Ticket_Class {

	private Print_Class print;
	private Scan_Class scan;
	private Method_Class meth;
	private File_Class file;
	private Total_Data_Class total;

	public Ticket_Class() throws IOException {
		print = new Print_Class();
		scan = new Scan_Class();
		meth = new Method_Class();
		total = new Total_Data_Class();
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
		scan.choice1(data);
	}

	public void Process(Data_Class data) {
		try {
			while (true) {
				Ticket(data);
				if (data.choice1 == 2) {
					print.total_price_result(data);
					scan.choice2(data);
					while (true) {
						if (data.choice2 == 1) {
							total.add(data);
							data = new Data_Class();
							break;
						} else if (data.choice2 == 2) {
							total.add(data);
							file.file(total);
							break;
						} else {
							print.error();
						}
					}
					if (data.choice2 == 2) {
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
