package ticket;

import java.io.IOException;

public class Ticket_Class {

	private Print_Class print;
	private Scan_Class scan;
	private Method_Class meth;
	private File_Class file;
	private Var_Class var;

	public Ticket_Class() throws IOException {
		print = new Print_Class();
		scan = new Scan_Class();
		meth = new Method_Class();
		file = new File_Class();
	}

	public void Ticket(Data_Class data) {
		while (true) {
			try {
				var = new Var_Class();
				scan.DorN(var);
				scan.reginum(var);
				meth.getAge(var);
				scan.nums(var);
				scan.treat(var);
				meth.price(var);
				data.add(var);
				scan.temp(var);
				if (var.temp == 2) {
					meth.temp(var, data);
					scan.temp2(var);
					if (var.temp2 == 2) {
						file.file(var, data);
						break;
					}
					break;
				}
			} catch (Exception e) {
				print.errorocu();
				e.printStackTrace();
			}
		}
	}
}
