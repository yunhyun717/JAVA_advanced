package ticket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Class {
	private File file;
	private FileWriter fw;
	private Print_Class print;
	private Data_Class data;
	private Method_Class meth;

	public File_Class() {
		data = new Data_Class();
		print = new Print_Class();
		meth = new Method_Class();
		file = new File(data.FILEPATH);
	}

	public void file(Total_Data_Class total) throws IOException {
		fw = new FileWriter(file, true);
		if (file.length() == 0) {
			fw.write(data.FILEMENU);
		}
		for (int i = 0; i < data.DORNTEMP.length; i++) {
			for (int j = 0; j < data.AGESTEMP.length; j++) {
				for (int k = 0; k < data.TREATTEMP.length; k++) {
					if (total.tickets[i][j][k] != 0) {
						fw.write(total.date + "," + data.DORNTEMP[i] + "," + data.AGESTEMP[j] + ","
								+ total.tickets[i][j][k] + "," + (total.tickets[i][j][k] * meth.result_price(i, j, k))
								+ "," + data.TREATTEMP[k].replace("우대사항", "").trim() + "\n");
					}
				}
			}
		}
		fw.close();
		print.thx();
	}
}
