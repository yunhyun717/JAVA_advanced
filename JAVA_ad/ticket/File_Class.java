package ticket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Class {
	private File file;
	private FileWriter fw;
	private Print_Class print;
	private Var_Class var;

	public File_Class() {
		var = new Var_Class();
		print = new Print_Class();
		file = new File(var.FILEPATH);
	}

	public void file(Var_Class var, Data_Class data) throws IOException {
		fw = new FileWriter(file, true);
		if (file.length() == 0) {
			fw.write(var.FILEMENU);
		}
		for (int i = 0; i < data.Arrayticket.size(); i++) {
			fw.write(data.Arrayticket.get(i).date + "," + data.Arrayticket.get(i).dorn() + ","
					+ data.Arrayticket.get(i).ages() + "," + data.Arrayticket.get(i).nums() + ","
					+ data.Arrayticket.get(i).price() + ","
					+ data.Arrayticket.get(i).treat().replaceAll("우대적용", "").trim() + "\n");
		}
		fw.close();
		print.thx();
	}
}
