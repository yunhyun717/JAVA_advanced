package report;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Class {
	private File file;
	private FileWriter fw;
	private FileReader fr;
	private ConstValue_Class cons;

	public File_Class() {
		file = new File(cons.FILEPATH);
	}

	public void file_read() throws IOException {
		fr = new FileReader(file, true);
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
